package SungJun_Misson;

import java.util.Scanner;

public class Baek0215_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        if (n == 0) {
            arr[0] = 0;
        }

        if (n == 1) {
            arr[1] = 1;
        }


        for (int i = 0; i < arr.length - 2; i++) {
            arr[0] = 0;
            arr[1] = 1;
            arr[i + 2] = arr[i] + arr[i + 1];
        }
        System.out.println(arr[n]);

    }
}
