package arbon.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_removeName {
    public static void main(String[] args) {

        ArrayList<String>names = new ArrayList<>(Arrays.asList("Ahmed",  "John", "Eric", "Ahmed"));
        System.out.println(names);

        names.removeIf(name -> name.equals("Ahmed"));
        System.out.println(names);

        /*
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        System.out.println(names);
         */



        /*
             ArrayList<String> listNames = new ArrayList<>();
               for (String each : names) {
            if(!each.equals("Ahmed")){
                listNames.add(each);
            }
        }
        System.out.println(listNames);
         */




    }
}
/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */