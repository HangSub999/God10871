package SungJun_Misson;

import java.util.Scanner;

public class Baek0323_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArry = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);

            if (cha >= 'A' && cha <= 'Z') {
                for (int j = 'A'; j <= 'Z'; j++) {
                    if (cha == j) {
                        strArry[i] = (char) (j + 32);
                        break;
                    }
                }
            } else if (cha >= 'a' && cha <= 'z') {
                for (int j = 'a'; j <= 'z'; j++) {
                    if (cha == j) {
                        strArry[i] = (char) (j - 32);
                        break;
                    }
                }
            }
            System.out.print(strArry[i]);
        }
    }
}
