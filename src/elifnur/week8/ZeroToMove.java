package elifnur.week8;

import java.util.Arrays;

public class ZeroToMove {
    public class MoveZerosToEnd {

        public static void moveZeros(int[] nums) {
            int index = 0; // Sıfır olmayan elemanların konulacağı indeks

            // Sıfır olmayan elemanları dizinin başına taşır
            for (int num : nums) {
                if (num != 0) {
                    nums[index++] = num;
                }
            }

            // Kalan indeksleri sıfır ile doldur
            while (index < nums.length) {
                nums[index++] = 0;
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 0, 2, 0, 3, 0, 4, 0};
            moveZeros(nums);
            System.out.println(Arrays.toString(nums)); // Örnek çıktı: [1, 2, 3, 4, 0, 0, 0, 0]
        }
    }
}
