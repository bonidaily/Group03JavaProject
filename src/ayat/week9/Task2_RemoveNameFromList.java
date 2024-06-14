package ayat.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2_RemoveNameFromList {
    public static void main(String[] args) {
        //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(removeName(names, "Ahmed"));

    }

    public static List<String> removeName(List<String> listOfNames, String name) {

       listOfNames.removeIf(p -> p.equalsIgnoreCase(name));

        return listOfNames;
    }
}
