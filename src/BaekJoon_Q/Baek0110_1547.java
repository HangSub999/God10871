package BaekJoon_Q;

import java.util.Scanner;

public class Baek0110_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[4];
        arr[1]++;
        int tmp = 0;
        int max = 0;

        for (int i = 1; i <= M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            tmp = arr[y];
            arr[y] = arr[x];
            arr[x] = tmp;

            for (int j = 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

        }
        for (int i = 1; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.println(i);
            }
        }
    }
}
