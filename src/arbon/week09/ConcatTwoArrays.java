package arbon.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0, y = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[y];
                y++;
            }

        }
        System.out.println(Arrays.toString(arr3));


    }
}
