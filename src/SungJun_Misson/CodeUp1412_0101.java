package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1412_0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ABCD = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int[] ABC = new int[26];

        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);
            for (int j = 0; j <= ABC.length; j++) {
                if (str.charAt(i) == 97 + j) {
                    ABC[j]++;
                }
            }
        }
        for (int i = 0; i < ABC.length; i++) {
            System.out.println(ABCD[i] + ":" + ABC[i]);
        }

    }

}

