package BaekJoon_Q;

import java.util.Scanner;

public class Baek0210_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tsetC = sc.nextInt();


        for (int i = 0; i < tsetC; i++) {
            int p = sc.nextInt();
            String strp = sc.next();

            for (int j = 0; j < strp.length(); j++) {
                for (int k = 0; k < p; k++) {
                    System.out.print(strp.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
