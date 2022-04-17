package BaekJoon_Q;

import java.util.Scanner;

public class CodeUp1402_0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            arrN[i] = sc.nextInt();
        }
        for (int arr : arrN) {
            System.out.print(arr + " ");
        }

    }
}
