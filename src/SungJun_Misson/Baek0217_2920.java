package SungJun_Misson;

import java.util.Scanner;

public class Baek0217_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrN = new int[8];
        int contOne = 0;
        int contTwo = 0;

        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
            if (arrN[i] == i + 1) {
                contOne++;
            } else if (arrN[i] == 8 - i) {
                contTwo++;
            }
        }
        if (contOne == 8) {
            System.out.println("ascending");
        } else if (contTwo == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }
}
