package BaekJoon_Q;

import java.util.Scanner;

public class Baek0227_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[8];
        int horse = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
            for (int j = 0; j < str[i].length(); j++) {
                char cha = str[i].charAt(j);
                if ((i + j) % 2 == 0 && cha == 'F') {
                    horse++;
                }
            }
        }
        System.out.println(horse);


    }
}
