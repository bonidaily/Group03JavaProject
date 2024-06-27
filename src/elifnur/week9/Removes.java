package elifnur.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class Removes {
    /*
    2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {
        String[] array = {"Ahmed", "John", "Eric", "Ahmed"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(array));

        System.out.println("Before delete  "+names);
        names.removeIf(name -> !name.equals("Ahmed"));
        System.out.println("After delete "+names);


    }
}

