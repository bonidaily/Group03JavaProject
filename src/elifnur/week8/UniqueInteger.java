package elifnur.week8;

import java.util.Arrays;

public class UniqueInteger {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;

        // İlk n-1 elemanı ayarla
        for (int i = 0; i < n - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }

        // Son elemanı, toplamı sıfır yapmak için ayarla
        result[n - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(sumZero(n))); // Örnek çıktı: [1, 2, 3, -6]

        n = 3;
        System.out.println(Arrays.toString(sumZero(n))); // Örnek çıktı: [1, 2, -3]
    }

}
