package BaekJoon_Q;

import java.util.Scanner;

public class Baek0306_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[9];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int aa = 0;
        int bb = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (a[i] + a[j] == sum - 100) {
                    aa = i;
                    bb = j;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (aa == i || bb == i) {
                continue;
            }
            System.out.println(a[i]);
        }


    }
}
