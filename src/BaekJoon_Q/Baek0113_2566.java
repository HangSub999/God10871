package BaekJoon_Q;


import java.util.Scanner;

public class Baek0113_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] N = new int[9][9];
        int max = 1;
        int I = 0;
        int J = 0;
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N.length; j++) {
                N[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N.length; j++) {
                if (max < N[i][j])
                    max = N[i][j];
            }
        }
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N.length; j++) {
                if (max == N[i][j]) {
                    I = i + 1;
                    J = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(I + " " + J);

    }
}
