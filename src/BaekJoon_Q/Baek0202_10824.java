package BaekJoon_Q;

import java.util.Scanner;

public class Baek0202_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] abcd = new String[4];

        for (int i = 0; i < 4; i++) {
            abcd[i] = sc.next();
        }

        String ab = abcd[0] + abcd[1];
        String cd = abcd[2] + abcd[3];

        long abl = Long.parseLong(ab);
        long cdl = Long.parseLong(cd);

        System.out.println(abl + cdl);
    }
}
