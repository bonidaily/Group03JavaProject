package Zerrin.Week10;

public class sortAscending {
    public static void main(String[] args) {

        int[] inputArr = {10, 9, 8, 7};
        int n = inputArr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (inputArr[j] > inputArr[j + 1]) {

                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j + 1];
                    inputArr[j + 1] = temp;
                }
            }
        }
        for (int num : inputArr) {
            System.out.print(num + " ");
        }
    }
}

