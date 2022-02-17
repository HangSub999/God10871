package SungJun_Misson;

import java.util.Scanner;

public class Baek17496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        if (t < n) {
           --n;
            n /= t;
            int sum = (n * c) * p;
            System.out.println(sum);
        }

    }
}
