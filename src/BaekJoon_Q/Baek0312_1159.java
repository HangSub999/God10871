package BaekJoon_Q;

import java.util.Scanner;

public class Baek0312_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] nChar = new char[n];
        int[] abc = new int[26];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            nChar[i] = str.charAt(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 'a'; j <= 'z'; j++) {
                if (nChar[i] == j) {
                    abc[j - 'a']++;
                }
            }

        }
        int cont = 0;
        for (int i = 0; i < 26; i++) {
            char a = 'a';
            for (int j = 0; j < 26; j++) {
                if (abc[j] < 5) {
                    cont++;
                }
            }
            if (cont == 26) {
                System.out.println("PREDAJA");
                break;
            }

            if (abc[i] > 4) {
                a += i;
                System.out.print(a);
            }
        }
    }
}
