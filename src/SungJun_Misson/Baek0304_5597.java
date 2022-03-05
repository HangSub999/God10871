package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0304_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] nArry = new int[30];

        int b = 0;
        int a = 0;

        for (int i = 0; i < nArry.length-2; i++) {
            nArry[i] = sc.nextInt();
        }


        for (int i = 0; i < nArry.length; i++) {

        for (int j = 1; j <= nArry.length; j++) {
            if (nArry[i] == 0 && a == 0) {
                a = j;

            } else if (nArry[i] == 0) {
                b = j;
            }
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
