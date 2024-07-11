package ayat.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingListDesc {
    public static void main(String[] args) {
        //int[] arr = {10,9,8,7,6,5,4,3,2,1};
        List<Integer> inpList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(sortDes(inpList));
    }

    public static List<Integer> sortDes(List<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {

            int min = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (min < list.get(j)) {
                    //min = arr[j];

                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }

        }

        return list;
    }

}
