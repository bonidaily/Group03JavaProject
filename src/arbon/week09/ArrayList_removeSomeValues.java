package arbon.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_removeSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 55, 204, 202, 101, 99));
        System.out.println(numbers);


//        numbers.removeIf(eachNumber -> eachNumber > 100);
//        System.out.println(numbers);


/*
  Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 100) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
 */




/*
ArrayList<Integer>newList = new ArrayList<>();
               for (Integer number : numbers) {
                      if(number <100){
                      newList.add(number);
            }
        }
        System.out.println(newList);
 */


    }


}
/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */