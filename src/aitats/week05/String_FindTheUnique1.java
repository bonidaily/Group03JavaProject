package aitats.week05;

public class String_FindTheUnique1 {

    // //String - Find the unique
    //    //*Write a return method that can find the unique characters from the String
    //    // Ex: unique("AAABBBCCCDEF") ==> "DEF";


    public static void main(String[] args) {

        System.out.println(UniqueCharacters("AAADVVVNNNDSXXYYTYUBN"));
    }


    public static String UniqueCharacters(String str) {

        String UniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                UniqueChars += currentChar;
            }
        }
        return UniqueChars;

    }

}
