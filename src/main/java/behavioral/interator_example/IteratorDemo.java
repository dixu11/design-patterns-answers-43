package behavioral.interator_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(23, 45, 567, 3245, 2));
        /*for (Integer number : numbers) {
            if (number > 50) {
                numbers.remove(number);
            }
        }*/

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 50) {
                iterator.remove();
            }
        }
        System.out.println(numbers);


    }
}
