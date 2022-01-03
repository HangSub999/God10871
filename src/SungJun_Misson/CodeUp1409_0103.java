package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1409_0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(arr[n]);

    }
}
