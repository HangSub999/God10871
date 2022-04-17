package BaekJoon_Q;

import java.util.Scanner;

public class Baek0303_7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char[] cha = str.toCharArray();

            if (i == 0) {
                sum = 10;
            } else {
                if (cha[i] == cha[i - 1]) {
                    sum += 5;
                } else {
                    sum += 10;
                }
            }

        }
        System.out.println(sum);
    }
}
