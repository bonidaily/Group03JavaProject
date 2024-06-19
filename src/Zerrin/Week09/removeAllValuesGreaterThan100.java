package Zerrin.Week09;

import java.util.ArrayList;
import java.util.List;

public class removeAllValuesGreaterThan100 {


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(110,1, 2, 3, 101, 4, 5, 105));

        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number <= 100) {
                filteredNumbers.add(number);
            }
        }
        System.out.println(filteredNumbers);
    }
}
