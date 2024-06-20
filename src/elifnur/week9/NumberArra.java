package elifnur.week9;

import java.util.ArrayList;

public class NumberArra {

    /*
    ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(101);
        numbers.add(102);
        numbers.add(103);

        System.out.println("Before remove"+numbers);

        numbers.removeIf(number -> number < 100);
        System.out.println("after remove" +numbers);

        }
    }

