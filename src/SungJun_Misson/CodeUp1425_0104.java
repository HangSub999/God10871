package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1425_0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        int c = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);
        int[] arrN2 = Arrays.copyOf(arrN, c);
        for (int i = 0; i < arrN2.length; i++) {
            System.out.print(arrN2[i] + " ");
        }
        System.out.println();
        for (int i = c; i < n; i++) {
            System.out.print(arrN[i] + " ");
        }
    }
}
