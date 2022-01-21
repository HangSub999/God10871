package SungJun_Misson;

import java.util.Scanner;

public class Baek0120_2484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dice = new int[7];
        int[] a = new int[N];
        int sum = 0;
        int cont = 0;
        while (cont > 5) {
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < 7; j++) {
                    if (a[i] == j) {
                        dice[j]++;
                    }
                }
            }

        }
    }
}
