package aitats.week07;

import java.util.ArrayList;

public class Array_FindMinimumNumber {

    /*
    Question1: Array - Find Minimum
 Write a method that can find the minimum number from an int Array

     */

    public static void main(String[] args) {

        int[]arr = {100,50,9,7,25,33,55,99,81};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Number = " + min);

    }
}
