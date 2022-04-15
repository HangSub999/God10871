package Learning.life_coding;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("add의 값");
        System.out.println(numbers);

        numbers.add(1, 50);
        System.out.println("nadd(인덱스,값)");
        System.out.println(numbers);

        numbers.remove(2);
        System.out.println("remove(인덱스)");
        System.out.println(numbers);

        System.out.println("get(인덱스)");
        System.out.println(numbers.get(2));

        System.out.println("size");
        System.out.println(numbers.size());

        System.out.println("indexOf");
        System.out.println(numbers.indexOf(10));

        Iterator it = numbers.iterator();

        System.out.println("Iterator");
        while (it.hasNext()) {
            int value = (int) it.next();
            if (value == 30) {
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(numbers);


    }
}
