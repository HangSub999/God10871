package BaekJoon_Q;

import java.util.Arrays;
import java.util.Scanner;

public class Q2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        long count = 0;
        for (int i = 0; i < num.length; i++) {
            count += Math.abs(i + 1 - num[i]);
        }
        System.out.println(count);
    }
}
