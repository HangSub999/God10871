package CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeUp1403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        int num = sc.nextInt();
        int count = 2;

        for (int i = 0; i < num; i++) {
            arrayList.add(sc.nextInt());
        }
        while (count != 0) {
            for (int i = 0; i < num; i++) {
                System.out.println(arrayList.get(i));
            }
            count--;
        }
    }
}
