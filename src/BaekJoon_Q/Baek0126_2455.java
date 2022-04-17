package BaekJoon_Q;

import java.util.Scanner;

public class Baek0126_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNull = sc.nextInt();
        int str = sc.nextInt();
        int max = 0;

        for (int i = 0; i < 3; i++) {
            int ma = sc.nextInt();
            int pul = sc.nextInt();
            str = (str - ma) + pul;

            if (max < str) {
                max = str;
            }
        }
        System.out.println(max);

    }
}
