package BaekJoon_Q;

import java.util.Scanner;

public class Baek2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = ((n - 1) * 2) - (i * 2 - 1); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
