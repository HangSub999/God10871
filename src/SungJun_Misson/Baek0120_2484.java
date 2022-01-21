package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0120_2484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dice = new int[7];
        int[] a = new int[N];
        int sum = 2000;  //같은 눈 2개씩 두쌍 금액의 합
        int[] win = new int[N];
        int cont = 0;
        int[] tow = new int[7];
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
            Arrays.sort(a);
            for (int i = 1; i < 7; i++) {
                if (dice[i] == 2) {
                    tow[i] = 2;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < 7; j++) {
                    if (dice[j] == 4) {
                        win[i] = 50000 + (i * 5000);
                    } else if (dice[j] == 3) {
                        win[i] = 10000 + (j * 1000);
                    } else if (tow[i] == 2) {
                        sum = sum + (i * 500);
                    } else if (dice[i] == 2 && dice[i + 1] != 2 && dice[i + 1] < dice[7]) {
                        win[i] = 1000 + (i * 100);
                    } else {
                        System.out.println(a[3]);
                        cont++;
                        break;
                    }
                }

            }
            Arrays.sort(win);
            if (win[3] > sum) {
                System.out.println(win[3]);

            } else {
                System.out.println(sum);

            }
            cont++;
            break;
        }
    }
}
