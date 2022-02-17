package SungJun_Misson;

import java.util.Scanner;

public class Baek2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = (n * 2) - (i + i); k > 0; k--) {
                System.out.print(" ");
            }
            for (int s = 0; s < i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            for (int k = (i * 2); k > 0; k--) {
                System.out.print(" ");
            }
            for (int s = i; s < n; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
