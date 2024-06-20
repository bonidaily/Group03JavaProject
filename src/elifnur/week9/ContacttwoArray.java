package elifnur.week9;

public class ContacttwoArray {
    /*1) Array - Concat two arrays
Write a return method that can concate two arrays

     */
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] result = concatArrays(array1, array2);
        for (int value : result) {
            System.out.print(value + " ");
        }

    }

    private static int[] concatArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        //add arry1 to result
        System.arraycopy(array1, 0, result, 0, array1.length);
        // add array 2 result
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
