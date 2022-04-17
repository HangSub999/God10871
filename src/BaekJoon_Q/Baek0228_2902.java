package BaekJoon_Q;

import java.util.Scanner;

public class Baek0228_2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] arryStr = str.split("-");
        char[] sum = new char[arryStr.length];

        for (int i = 0; i < arryStr.length; i++) {

            char cha = arryStr[i].charAt(0);

            if (cha > 64 && cha < 91) {
                sum[i] = cha;
            }
        }
        for (char cc : sum) {
            System.out.print(cc);
        }
    }
}
