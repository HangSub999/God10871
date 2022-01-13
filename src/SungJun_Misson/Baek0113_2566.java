package SungJun_Misson;


import java.util.Scanner;

//내일 다시 풀어야함
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
                if (max > N[i][j])
                    max = (Math.max(N[i][j], N[N.length - 1][N.length - 1]));
            }
        }
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N.length; j++) {
                if (max == N[i][j]) {
                    I = i;
                    J = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(I + " " + J);

    }
}
