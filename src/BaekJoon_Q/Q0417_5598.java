package BaekJoon_Q;

import java.util.Scanner;

public class Q0417_5598 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char[] cha = str.toCharArray();
            if (cha[i] >= 'D' && cha[i] <= 'Z') {
                cha[i] -= 3;
                System.out.print(cha[i]);
            } else {
                cha[i] += 23;
                System.out.print(cha[i]);
            }

        }
    }
}
