package BaekJoon_Q;

import java.util.Scanner;

//동전 0
public class Q11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= num[i]) {
                count += k / num[i];
                k %= num[i];
                if (k == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
