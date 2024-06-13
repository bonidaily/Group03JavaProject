package eve.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] nums= {0,1,0,2,0,0,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosBack(nums)));
    }

    public static int[] moveZerosBack( int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if(nums[j]==0){
                    nums[j]=nums[j+1];
                    nums[j+1]=0;

                }

            }

        }
        return nums;
    }
}
