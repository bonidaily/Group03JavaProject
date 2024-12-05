package eve.week10;

import java.util.ArrayList;
import java.util.List;

public class Task1_ArrayListSortingAsc_Eve {

    public static void SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        SortingArrayListAsc(list);

        System.out.println("Sorted List: " + list);
    }
}
