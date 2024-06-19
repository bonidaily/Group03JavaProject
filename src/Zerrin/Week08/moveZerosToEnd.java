package Zerrin.Week08;

import java.util.Arrays;

public class moveZerosToEnd {

    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 0, 3, 0, 4, 0};
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}

