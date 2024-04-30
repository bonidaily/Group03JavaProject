package aitats.week05;

import javax.xml.stream.events.Characters;
import java.util.*;

public class String_FindTheUnique {

    //String - Find the unique 
    //*Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {


        String str= "AAABBBCCCDEF";

        // Karakterleri saklamak için bir karakter listesi oluşturur.
        // List<Character> türünde bir ArrayList oluşturulur.
        List<Character> charList = new ArrayList<>();

        // Dizeyi dolaşmak için bir for döngüsü başlatır.
        // Döngü, dize boyunca her karakteri işlemek için kullanılır.
        for (int i = 0; i < str.length(); i++) {

           // Her döngü adımında, dizeden (str) mevcut karakter alınır (str.charAt(i))
            // ve karakter listesine (charList) eklenir.
            charList.add(str.charAt(i));
        }
        // Elde edilen karakter listesini yazdır
        System.out.println("Character list: " + charList);





        List<Character> uniqueCharsList = new ArrayList<>();


        for (Character ch : charList) {
            if (!uniqueCharsList.contains(ch)) {
                uniqueCharsList.add(ch);
            }
        }


// Karakter listesini dolaşarak yalnızca bir kez bulunanları bul
        //for (char each : charList) {
            // Karakterin kaç kez tekrarlandığını say
            //int count = Collections.frequency(charList, each);

            // Eğer karakter sadece bir kez bulunuyorsa, listeye ekle
            //if (count == 1) {
                //uniqueCharsList.add(c);



// Yalnızca bir kez bulunan karakterleri yazdır
        System.out.println("Unique characters: " + uniqueCharsList);


    }

    
}
