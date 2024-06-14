package ayat.week9;

import java.util.Arrays;

public class Task1_concat_2_arrays {
    public static void main(String[] args) {
        //Write a return method that can concate two arrays

        Object[] array1={"I","love"};
        Object[] array2={"JAVA","coding"};

        System.out.println(Arrays.toString(concatArrays(array1,array2)));

    }
    public static Object[] concatArrays(Object[]arr1,Object[]arr2){
        Object[] result=new Object[arr1.length+arr2.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            result[j]=arr1[i];
            j++;

        }
        for (int i = 0; i < arr2.length; i++) {
            result[j]=arr2[i];
            j++;

        }

        return result;
    }
}
