package Zerrin.Week09;

import java.util.ArrayList;
import java.util.List;

public class removeAhmed {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ahmed", "John", "Eric", "Ahmed"));

        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (!name.equals("Ahmed")) {
                filteredNames.add(name);
            }
        }
        names = filteredNames;

        System.out.println(names);
    }
}

