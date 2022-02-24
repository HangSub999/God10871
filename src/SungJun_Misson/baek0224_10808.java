package SungJun_Misson;

import java.util.Scanner;

public class baek0224_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] alphabet = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 'a'; j <= 'z'; j++) {
                if (ch == j) {
                    alphabet[j - 'a']++;
                }
            }
        }
        for (int cc : alphabet) {
            System.out.print(cc + " ");
        }
    }
}
