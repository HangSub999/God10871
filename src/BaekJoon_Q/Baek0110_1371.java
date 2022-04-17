package BaekJoon_Q;

import java.util.Scanner;

// 왜 안되는지 모르겠음
public class Baek0110_1371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] abc = new int[26];

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    abc[str.charAt(i) - 'a']++;
                }
            }


            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (max < abc[i]) {
                    max = abc[i];
                }
            }
            for (int i = 0; i < 26; i++) {
                if (max == abc[i]) {
                    System.out.println((char) (i + 'a'));
                }
            }
        }
    }
}
