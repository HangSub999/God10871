package BaekJoon_Q;

import java.util.Scanner;

public class Baek0314_10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] strChar = {'a', 'e', 'i', 'o', 'u'};

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char cha = str.charAt(i);
            for (int j = 0; j < 5; j++) {
                if (cha == strChar[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
