package ayat.week8;

import java.util.Arrays;

public class Task2_moveZeros {
    /*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]

     */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0,5,0};
        System.out.println(Arrays.toString(sortedArr(arr)));
    }

    public static int[] sortedArr(int[] inputArr) {

        int[] sortedArr = new int[inputArr.length];
        int j = 0;

        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] != 0) {
                sortedArr[j] = inputArr[i];
                j++;
            }

        }


        return sortedArr;
    }
}
