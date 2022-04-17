package BaekJoon_Q;

import java.util.Scanner;

public class Baek0110_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String str = sc.nextLine();
            String str2 = str.toLowerCase();
            if (str.equals("#")) {
                break;
            }
            int cnt = 0;
            String[] arrStr = {"a", "e", "i", "o", "u"};

            for (int i = 0; i < arrStr.length; i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (arrStr[i].equals(str2.substring(j, j + 1))) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }

    }
}
