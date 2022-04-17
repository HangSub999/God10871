package BaekJoon_Q;

import java.util.Scanner;

public class Baek_0130_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] book = new int[9];
        int bookSum = 0;

        for (int i = 0; i < 9; i++) {
            book[i] = sc.nextInt();
            bookSum += book[i];
        }
        System.out.println(total - bookSum);
    }
}
