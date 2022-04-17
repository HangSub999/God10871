package BaekJoon_Q;

import java.util.Scanner;

public class BaekTest2 {
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
        for (int i = n - 1; 0 < i; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
