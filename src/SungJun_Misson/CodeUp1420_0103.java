package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1420_0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] score = new int[n];
        String[] nam = new String[n];


        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            score[i] = sc.nextInt();
            nam[i] = str[i] + " " + score[i];
        }
        Arrays.sort(score);
        //이 부분 이해 절대 안됨 메소드 찾아봐도 이해 안댐 시펄
        for (int i = 0; i < nam.length; i++) {
            if (nam[i].contains(String.valueOf(score[n - 3]))) {
                String[] result = nam[i].split(" ");
                System.out.println(result[0]);
            }
        }
    }
}
