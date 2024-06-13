package Zerrin.Week07;

public class find_Minimum {

    public static void main(String[] args) {
        int[] arr = {104, 34, 23, 75, 44, 15, 64};
        int minNumber = arr[0];

        for (int num : arr) {
            if (num < minNumber) {
                minNumber = num;
            }
        }
        System.out.println("The minimum number is: " + minNumber);
    }
}
