package arbon.week08;

import java.util.Arrays;

public class MoveZerosToEnd {


    public static void main(String[] args) {

        int[] array = {0, 1, 2, 0, 3, 0, 4, 0};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] == 0) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(array));


    }
}
/*

Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */


//move zeros to beginning

//            for (int j = array.length - 1; j > 0; j--) {
//
//                if (array[j] == 0) {
//                    int temp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = temp;
//
//                }
//
//            }