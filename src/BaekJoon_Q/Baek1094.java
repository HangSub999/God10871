package BaekJoon_Q;

import java.util.Scanner;

public class Baek1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cnt = 0;
        int n = 64;

        while (x > 0) {
            if (n > x) {
                n = n / 2;
            } else {
                cnt++;
                x = x - n;
            }
        }
        System.out.println(cnt);
    }
}
