package SungJon_Test;

import java.util.Scanner;

public class Baek_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int sum = (60 + m) - 45;

        m = 100;

        if (h >= 0 && m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else if (h == 0) {
            System.out.println(23 + " " + sum);
        } else if (h > 0) {
            h--;
            System.out.println(h + " " + sum);
        }
    }
}
