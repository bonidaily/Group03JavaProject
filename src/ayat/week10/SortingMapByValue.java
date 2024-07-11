package ayat.week10;

import java.util.*;

public class SortingMapByValue {
    public static void main(String[] args) {
        //Map - Sort the map by values
        //Write a method that can sort the Map by values.
        Map<String,Integer> map1=new HashMap<>();
        map1.put("value1",9);
        map1.put("value2",7);
        map1.put("value3",5);
        map1.put("value4",3);
        map1.put("value5",1);

        System.out.println("Before sorting"+map1);

        System.out.println("AfterSorting"+sortByValue(map1));


    }
    public static Map<String,Integer> sortByValue(Map<String,Integer> map){
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        Collections.sort(list);

        Map<String,Integer> result = new LinkedHashMap<>();

        for(int i=0; i<list.size(); i++){
            for(Map.Entry<String, Integer> each : map.entrySet()){
                if(each.getValue() == list.get(i)){
                    result.put(each.getKey(), each.getValue());
                    break;
                }
            }

        }





        return result;
    }


}
