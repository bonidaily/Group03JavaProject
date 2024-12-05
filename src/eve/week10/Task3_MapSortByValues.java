package eve.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Task3_MapSortByValues {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 5);
        map1.put("B", 1);
        map1.put("C", 3);
        map1.put("D", -2);
        map1.put("E", 8);
        map1.put("F", 0);
        //Map<String, Integer> map1= Map.of("A",5,"B",1)
        System.out.println(map1);
       //System.out.println(sortMapByValues(map1));
        System.out.println(sortMapByValues1(map1));
    }

    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map1) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map1.entrySet());
        for (int i = 0; i < entries.size() - 1; i++) {
            for (int j = 0; j < entries.size() - 1; j++) {
                if (entries.get(j).getValue() > entries.get(j + 1).getValue()) {
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j + 1));
                    entries.set(j + 1, temp);

                }

            }
        }
        Map<String, Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> each : entries) {
            sorted.put(each.getKey(), each.getValue());
        }
        return sorted;
    }


    public static Map<String, Integer> sortMapByValues1(Map<String, Integer> map1) {
        List<Map.Entry<String, Integer>> listOfMaps = new ArrayList<>();
        for (Map.Entry<String, Integer> eachEntries : map1.entrySet()) {

            listOfMaps.add((Map.Entry<String, Integer>) eachEntries);
        }
            for (int i = 0; i < listOfMaps.size() - 1; i++) {
                for (int j = 0; j < listOfMaps.size() - 1; j++) {
                    if (listOfMaps.get(j).getValue() > listOfMaps.get(j + 1).getValue()) {
                        Map.Entry<String, Integer> temp = listOfMaps.get(j);
                        listOfMaps.set(j, listOfMaps.get(j + 1));
                        listOfMaps.set(j + 1, temp);
                    }
                }
            }

            Map<String, Integer> sorted = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> each : listOfMaps) {
                sorted.put(each.getKey(), each.getValue());
            }


          return sorted;
        }


    }




