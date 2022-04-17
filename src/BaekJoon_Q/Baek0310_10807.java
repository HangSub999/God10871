package BaekJoon_Q;

import java.util.Scanner;

public class Baek0310_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nArray = new int[n];

        for (int i = 0; i < n; i++) {
            nArray[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nArray[i] == v) {
                count++;
            }
        }
        System.out.println(count);
    }
}
