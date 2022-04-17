package BaekJoon_Q;

import java.util.Scanner;

public class Baek2577_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[10];
        int sum = A * B * C;

        while (sum != 0) {
            arr[sum % 10]++;
            sum = sum / 10;
        }
        for (int var : arr) {
            System.out.println(var);
        }
    }
}
