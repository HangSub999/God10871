package Learning.life_coding;

import java.util.ArrayList;

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
    }
}
