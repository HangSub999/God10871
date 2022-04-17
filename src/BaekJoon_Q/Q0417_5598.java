package BaekJoon_Q;

import java.util.Scanner;

public class Q0417_5598 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char[] cha = str.toCharArray();
            if (cha[i] >= 'D' || cha[i] <= 'Z') {
                System.out.print((char) (cha[i] - 3));
            } else {
                System.out.print((char) (cha[i] + 23));
            }

        }
    }
}
