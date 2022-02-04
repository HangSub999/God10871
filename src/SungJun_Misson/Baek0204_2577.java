package SungJun_Misson;

import java.util.Scanner;

public class Baek0204_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] cont = new int[10];

        int sum = a * b * c;

        String strNum = Integer.toString(sum);
        int[] arrNum = new int[strNum.length()];

        for (int i = 0; i < strNum.length(); i++) {
            arrNum[i] = strNum.charAt(i) - '0';
            for (int j = 0; j < 10; j++) {
                if (arrNum[i] == j) {
                    cont[j]++;
                }
            }
        }
        for (int cc : cont) {
            System.out.println(cc);
        }

    }
}
