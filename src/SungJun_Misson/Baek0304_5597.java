package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0304_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[28];
        int[] nArry = new int[30];
        int max = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        Arrays.sort(N);

        for (int i = 0; i < N.length; i++) {
            nArry[N[i]]++;
        }
        for (int i = 0; i < nArry.length; i++) {
            if (nArry[i] == 0 && max == 0) {
                a = i + 1;
                max++;
            } else if (nArry[i] == 0) {
                b = i + 1;
            }
        }
        if (a > b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
        }

    }
}
