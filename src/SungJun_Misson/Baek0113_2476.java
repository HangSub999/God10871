package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0113_2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dice = new int[N][3];
        int[] sum = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dice[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            if (dice[i][0] == dice[i][1] && dice[i][1] == dice[i][2] && dice[i][0] == dice[i][2]) {
                sum[i] = 10000 + (dice[i][0] * 1000);
            } else if (dice[i][0] == dice[i][1] || dice[i][0] == dice[i][2] || dice[i][1] == dice[i][2]) {
                sum[i] = 1000 + 100 * (dice[i][0] == dice[i][1] ? dice[i][0] : dice[i][2]);
            } else {
                if (dice[i][0] > dice[i][1] && dice[i][0] > dice[i][2]) {
                    sum[i] = dice[i][0] * 100;
                } else if (dice[i][1] > dice[i][0] && dice[i][1] > dice[i][2]) {
                    sum[i] = dice[i][1] * 100;
                } else if (dice[i][2] > dice[i][0] && dice[i][2] > dice[i][1]) {
                    sum[i] = dice[i][2] * 100;
                }
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[sum.length - 1]);
    }
}
