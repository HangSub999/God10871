package SungJun_Misson;

import java.util.Scanner;

public class Baek0224_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testSite = sc.nextInt();
        int[] candiDates = new int[testSite];


        for (int i = 0; i < testSite; i++) {
            candiDates[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();

        long count = 0;
        for (int i = 0; i < testSite; i++) {

            candiDates[i] -= b;
            count++;

            if (candiDates[i] <= 0) {
                continue;
            } else {
                count += candiDates[i] / c;

                if (candiDates[i] % c > 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}







