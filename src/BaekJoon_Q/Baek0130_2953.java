package BaekJoon_Q;

import java.util.Scanner;

public class Baek0130_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] participant = new int[5][4];
        int[] score = new int[5];
        int max = 0;
        int maxNum = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                participant[i][j] = sc.nextInt();
                score[i] += participant[i][j];
            }
            if (score[i] > max) {
                max = score[i];
                maxNum = i + 1;
            }
        }

        System.out.println(maxNum + " " + max);


    }


}

