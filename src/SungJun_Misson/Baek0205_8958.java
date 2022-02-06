package SungJun_Misson;

import java.util.ArrayList;
import java.util.Scanner;

public class Baek0205_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCas = sc.nextInt();
        String str;
        int[] count;

        for (int i = 0; i < testCas; i++) {
            str = sc.next();
            count = new int[str.length()];
            for (int j = 0; j < str.length(); j++) {
                char cha = str.charAt(j);
                if (cha == 'O') {
                    count[j]++;
                }
            }
        }
    }
}
