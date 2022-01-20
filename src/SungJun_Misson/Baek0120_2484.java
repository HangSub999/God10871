package SungJun_Misson;

import java.util.Scanner;

public class Baek0120_2484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arrN = new int[N][4];
        int[] sum = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                arrN[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                if (arrN[i][j] == arrN[i][j]) {
                    sum[i] = 65000;
                }
            }
        }
    }
}
