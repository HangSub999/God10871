package SungJun_Misson;

import java.util.Scanner;

public class Baek0113_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[5];
        int sum = 0;

        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
            arrN[i] = (int) Math.pow(arrN[i], 2);
            sum += arrN[i];
        }
        System.out.println(sum % 10);
    }
}
