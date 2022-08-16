package BaekJoon_Q;

import java.util.Arrays;
import java.util.Scanner;

public class Q11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[scanner.nextInt()];
        int[] sum = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i != 0) {
                num[i] += num[i - 1];
            }
            sum[i] = num[i];
        }
        int total = 0;
        for (int j : sum) {
            total += j;
        }
        System.out.println(total);
    }
}
