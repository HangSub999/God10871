package SungJun_Misson;

import java.util.Scanner;

public class Baek0203_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum - (N - 1));

    }
}
