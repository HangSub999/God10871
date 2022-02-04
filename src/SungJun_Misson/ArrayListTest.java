package SungJun_Misson;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<Integer>();
        ArrayList<Integer> i2 = new ArrayList<>();
        ArrayList<Integer> i3 = new ArrayList<Integer>(10);
        ArrayList<Integer> i4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));


        i.add(3);
        i.add(2);
        i.set(1, 0);
        System.out.println(i);

        i3.add(55);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.add(52);
        i3.set(3, 51);

        for (int j = 0; j < i3.size(); j++) {
            System.out.println(i3.get(j) + " ");
        }
    }
}
