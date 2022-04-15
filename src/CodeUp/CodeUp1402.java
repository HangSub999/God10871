package CodeUp;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeUp1402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arrayList.add(sc.nextInt());
        }
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
