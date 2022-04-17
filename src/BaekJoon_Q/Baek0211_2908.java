package BaekJoon_Q;

import java.util.Scanner;

public class Baek0211_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] intA = new int[a.length()];
        int[] intB = new int[a.length()];
        int sumA = 0;
        int sumB = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            intA[i] = Character.getNumericValue(a.charAt(i));
            intB[i] = Character.getNumericValue(b.charAt(i));

            if (i == 2) {
                intA[i] = intA[i] * 100;
                intB[i] = intB[i] * 100;
            } else if (i == 1) {
                intA[i] = intA[i] * 10;
                intB[i] = intB[i] * 10;
            }
            sumA += intA[i];
            sumB += intB[i];
        }
        if (sumA > sumB) {
            System.out.println(sumA);
        } else {
            System.out.println(sumB);
        }

    }
}
