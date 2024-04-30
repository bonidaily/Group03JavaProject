package aitats.week04;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyOfCharacters {

    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2


        public static String frequencyOfChars(String str) {

            Map<Character, Integer> frequencyMap = new HashMap<>();


            for (char ch : str.toCharArray()) {
                // If the character is already in the map, increment its frequency
                if (frequencyMap.containsKey(ch)) {
                    frequencyMap.put(ch, frequencyMap.get(ch) + 1);
                }
                // If the character is not in the map, add it with frequency 1
                else {
                    frequencyMap.put(ch, 1);
                }
            }

            // Create a StringBuilder to construct the result string
            StringBuilder result = new StringBuilder();

            // Iterate through the map and append character-frequency pairs to the result
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                result.append(entry.getKey());
                result.append(entry.getValue());
            }

            // Return the result as a string
            return result.toString();
        }

        public static void main(String[] args) {
            // Test the method
            String str = "AAABBCDD";
            System.out.println(frequencyOfChars(str));
        }
    }



