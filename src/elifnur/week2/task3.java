package elifnur.week2;

public class task3 {
    public static void main(String[] args) {
        int N = 24;
        for (int i = 1; i < N; i++) {
            if ((i % 2 == 0 && i % 3 == 0)) {
                System.out.println("CodilityTest");

            } else if (i % 3 == 0) {
                System.out.println("Test");


            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");

            } else if (i % 2 == 0) {

                System.out.println("Codility");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("Codi1tyCoders");

            } else {
                System.out.println(" " + i + " ");
            }
        }

    }
}
