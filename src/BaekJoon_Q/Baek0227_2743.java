package BaekJoon_Q;

import java.util.Scanner;

public class Baek0227_2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
