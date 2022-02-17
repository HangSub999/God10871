package SungJun_Misson;

import java.util.Scanner;

public class Baek1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                System.exit(0);
            }
            String[] arr = new String[s.length()];
            String[] arr2 = new String[s.length()];

            for (int i = 0; i < s.length(); i++) {
                arr[i] = s.substring(i, i + 1);
            }
            for (int j = 0; j < s.length(); j++) {
                arr2[j] = arr[s.length() - 1 - j];
            }
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (arr[i].equals(arr2[i])) {
                    cnt++;
                }
            }
            if (cnt == s.length()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
