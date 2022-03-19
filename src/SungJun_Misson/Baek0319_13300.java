package SungJun_Misson;

import java.util.Scanner;

public class Baek0319_13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int room = sc.nextInt();
        int[] totS = new int[6];
        int[] totM = new int[6];
        int romS = 0;
        int romm = 0;
        for (int i = 0; i < number; i++) {
            int ss = sc.nextInt();
            int n = sc.nextInt();
            if (ss == 0) {
                totS[n - 1]++;
            } else if (ss == 1) {
                totM[n - 1]++;
            }
        }
        for (int i = 0; i < totS.length; i++) {
            if (totS[i] == 1) {
                romS++;
            } else {
                for (int j = room; j >= 0; j--) {

                }
            }
        }

    }
}
