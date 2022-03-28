package SungJun_Misson;

import java.util.Scanner;

public class Baek0328_2864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        char[] chaS = new char[str.length()];
        char[] cha2S = new char[str2.length()];

        int intS = 0;
        for (int i = 0; i < str.length(); i++) {
            chaS[i] = str.charAt(i);
            if (chaS[i] == '6') {
                chaS[i] = '5';
            }
            intS = Character.getNumericValue(chaS[i]);

        }
        for (int i = 0; i < str2.length(); i++) {
            cha2S[i] = str2.charAt(i);
            if (cha2S[i] == '6') {
                cha2S[i] = '5';
            }
        }

    }
}
