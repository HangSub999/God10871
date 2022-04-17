package BaekJoon_Q;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0309_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
            sum += n[i];
        }
        Arrays.sort(n);

        System.out.println(sum / 5);
        System.out.println(n[2]);
    }
}
