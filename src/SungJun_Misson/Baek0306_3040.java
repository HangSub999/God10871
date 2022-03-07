package SungJun_Misson;

import java.util.Scanner;

public class Baek0306_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[9];
        int[] b = new int[7];

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        sum = sum - 100;
        int aa = 1;
        int bb = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (a[i] + a[j] == sum) {
                    aa = a[i];
                    bb = a[j];
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[j] != aa && a[j] != bb) {
                    b[i] = a[j];

                }
            }
        }
        for (int cc : b) {
            System.out.println(cc);
        }
        System.out.println(aa + " " + bb);
    }
}
