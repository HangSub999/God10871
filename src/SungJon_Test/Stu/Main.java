package SungJon_Test.Stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        Arrays arrays = new Arrays();
        for (int i = 0; i < 3; i++) {
            Array array = new Array();
            for (int j = 0; j < 3; j++) {
                array.arrayAdd(scanner.nextInt());
            }
            arrays.arraysAdd(array);
        }

        System.out.println(arrays.arrayList.get(0).list.get(1));

    }
}
