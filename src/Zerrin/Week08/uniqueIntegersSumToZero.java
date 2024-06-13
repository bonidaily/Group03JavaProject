package Zerrin.Week08;

import java.util.Arrays;

public class uniqueIntegersSumToZero {

    public static void main(String[] args) {

        int N = 5;
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;      //result[0] = 1, result[1] = 2, result[2] = 3
            sum += result[i];
        }
        result[N - 1] = -sum;

        System.out.println(Arrays.toString(result));
    }
}