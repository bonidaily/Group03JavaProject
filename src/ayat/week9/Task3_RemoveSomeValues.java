package ayat.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3_RemoveSomeValues {
    public static void main(String[] args) {
        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 200, 300, 100, 4, 5, 6, 400, 500, 600));
        System.out.println(removeValues(list));
    }

    public static List<Integer> removeValues(List<Integer> list) {

        list.removeIf(p -> p > 100);

        return list;
    }
}
