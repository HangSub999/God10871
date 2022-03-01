package SungJun_Misson;

import java.util.Scanner;

public class Baek0301_10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;


        while (sc.hasNext()) {
            int a = 0;  //소문자
            int A = 0;  //대문자
            int n = 0; //숫자
            int g = 0; //공백

            str = sc.nextLine();

            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);
                if (cha > 96 && cha < 123) {
                    a++;
                }
            }
            for (int j = 0; j < str.length(); j++) {
                char cha2 = str.charAt(j);
                if (cha2 > 64 && cha2 < 91) {
                    A++;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);
                if (cha > 47 && cha < 58) {
                    n++;
                }
            }
            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);
                if (cha == ' ') {
                    g++;
                }
            }
            System.out.println(a + " " + A + " " + n + " " + g);

        }


    }
}
