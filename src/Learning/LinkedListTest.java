package Learning;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
