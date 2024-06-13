package eve.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesArray {

    public static void main(String[] args) {
        int[] nums= {1,1,2,3,4,4,5,6,6,6,6,7,7,7,7,8,1,4,8,9,0,7,0};
        System.out.println("UniqueElementsArray = " + Arrays.toString(removeDuplicatesArray(nums)));
    }
    public static int[] removeDuplicatesArray(int[] nums){
        List<Integer> numsUnique= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count==1) {
                numsUnique.add(nums[i]);
            }
        }
        Integer[] numsUniqueArr = numsUnique.toArray(new Integer[0]);
        int[] numsUniqueLast= new int[numsUniqueArr.length];
        for (int i = 0; i < numsUniqueArr.length; i++) {
            numsUniqueLast[i]= numsUniqueArr[i];

        }
        return numsUniqueLast;
    }


}
