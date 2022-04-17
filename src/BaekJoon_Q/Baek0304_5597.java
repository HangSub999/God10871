package BaekJoon_Q;

import java.util.Scanner;

public class Baek0304_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] nArry2 = new int[30];
        int b = 0;
        int a = 0;

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();

            for (int j = 1; j <= nArry2.length; j++) {
                if (n == j) {
                    nArry2[j - 1] = j;
                }
            }
        }


        for (int i = 0; i < nArry2.length; i++) {
            if (nArry2[i] == 0 && a == 0) {
                a = i + 1;
            } else if (nArry2[i] == 0) {
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
