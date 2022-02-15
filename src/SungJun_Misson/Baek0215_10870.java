package SungJun_Misson;

import java.util.Scanner;

public class Baek0215_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrn = new int[n + 1];

        int sum = 0;

        for (int i = 0; i < arrn.length - 2; i++) {
            arrn[0] = 0;
            arrn[1] = 1;
            arrn[i + 2] = arrn[i] + arrn[i + 1];
        }
        System.out.println(arrn[n]);
    }
}
