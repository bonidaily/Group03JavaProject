package arbon.week05;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }
    public static String reverse (String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }
       return reverse;
    }
}
/*
String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA
 */