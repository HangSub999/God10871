package SungJon_Test;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //입력
        String str2 = str.toUpperCase();//대문자 변환

        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'M'
                , 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] cont = new int[abc.length];
        int max = 0;


        for (int i = 0; i < abc.length; i++) {

                char ch = str2.charAt(i);

            for (int j = 0; j < abc.length; j++) {
                if (ch == abc[j]) {
                    cont[j]++;
                }
            }
        }
        for (int i = 0; i < abc.length; i++) {
            if (cont[i] > max) {
                max = cont[i];
                if (max == cont[i] && max >= 2) {
                    System.out.println("?");
                    break;
                }
            }
        }

    }
}
