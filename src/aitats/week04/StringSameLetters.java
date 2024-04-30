package aitats.week04;

import java.util.HashMap;
import java.util.Map;

public class StringSameLetters {


    public static boolean same(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create maps to store the frequency of characters in both strings
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();

        // Populate the frequency map for the first string
        for (char ch : str1.toCharArray()) {
            frequencyMap1.put(ch, frequencyMap1.getOrDefault(ch, 0) + 1);
        }

        // Populate the frequency map for the second string
        for (char ch : str2.toCharArray()) {
            frequencyMap2.put(ch, frequencyMap2.getOrDefault(ch, 0) + 1);
        }

        // Check if the frequency maps are equal
        return frequencyMap1.equals(frequencyMap2);
    }

    public static void main(String[] args) {
        // Test the method
        System.out.println(same("abc", "cab")); // Output: true
        System.out.println(same("abc", "abb")); // Output: false
    }
}
