package Zerrin.Week10;

import java.util.*;
public class mapSort {

    public static void main(String[] args) {

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Zebra", 3);
        unsortedMap.put("Giraffe", 2);
        unsortedMap.put("Elephant", 5);
        unsortedMap.put("Lion", 4);

        System.out.println("Unsorted Map: " + unsortedMap);

        // Map girdilerini bir List'e dönüştür
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

        // Listeyi değerlerine göre sırala (Bubble Sort kullanarak)
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getValue() > list.get(j + 1).getValue()) {
                    // Swap işlemi
                    Map.Entry<String, Integer> temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        // Sıralı girdileri yeni bir LinkedHashMap'e koy
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Sorted Map: " + sortedMap);
    }
}


