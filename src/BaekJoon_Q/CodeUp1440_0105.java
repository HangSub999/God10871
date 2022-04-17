package BaekJoon_Q;

import java.util.Scanner;

public class CodeUp1440_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];

        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < n; j++) {
                if (arrN[i] < arrN[j] && i != j) {
                    System.out.print("< ");
                } else if (arrN[i] > arrN[j] && i != j) {
                    System.out.print("> ");
                } else if (arrN[i] == arrN[j] && i != j) {
                    System.out.print("= ");
                }


            }
            System.out.println();

        }
    }
}
