package BaekJoon_Q;

import java.util.Scanner;

public class Baek0212_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] maseg = {" ", " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ",};
        int timeOne = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < maseg.length; j++) {
                for (int k = 0; k < maseg[j].length(); k++) {
                    if (str.charAt(i) == maseg[j].charAt(k)) {
                        timeOne += j + 1;

                    }

                }
            }
        }
        System.out.println(timeOne);
    }
}