package BaekJoon_Q;

import java.util.Scanner;

public class Baek0328_2864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        String minA = "";
        String maxA = "";

        for (int i = 0; i < strA.length(); i++) {
            if (strA.charAt(i) == '6') {
                minA += "5";
            } else {
                minA += strA.charAt(i);
            }

            if (strA.charAt(i) == '5') {
                maxA += "6";
            } else {
                maxA += strA.charAt(i);
            }
        }

        String minB = "";
        String maxB = "";
        for (int i = 0; i < strB.length(); i++) {
            if (strB.charAt(i) == '6') {
                minB += "5";
            } else {
                minB += strB.charAt(i);
            }

            if (strB.charAt(i) == '5') {
                maxB += "6";
            } else {
                maxB += strB.charAt(i);
            }
        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.println(min + " " + max);
    }
}
