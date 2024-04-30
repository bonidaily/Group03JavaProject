package aitats.week05;

import java.util.ArrayList;
import java.util.List;

public class String_FindTheUnique2 {

    public static void main(String[] args) {

        ////String - Find the unique
        //    //*Write a return method that can find the unique characters from the String
        //    // Ex: unique("AAABBBCCCDEF") ==> "DEF";

        String str = "AAABBBCCCDEF";
        String uniqueElements = findUniqueElement(str);
        System.out.println("Unique elements: " + uniqueElements);
    }

    public static String findUniqueElement(String str) {
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
        }
//StringBuilder is replaceable ! String is not replaceable ,
// StringBuilder using for text manipulation ! Sting is immutable

        StringBuilder unique = new StringBuilder();

        for (char ch : characterList) {    // for each loop we are checking every character in the list
            int count = 0;   // count helps us to know how many times run the character and every turn its=0

            //nested loop
            for (char c : characterList) { //check on the list if match with other characters
                if (ch == c) {
                    count++;
                }
            }
            if (count == 1) {  //check how many times the character repeated and if repeated 1 time add to the unique list
                unique.append(ch); //append using for adding new character to the list
            }

        }
        return unique.toString(); //calling for return the characters in StringBuilder as a String
    }
}
