package SungJun_Misson;

import java.util.Scanner;

public class Baek0214_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }
        int result = search(arrN, N, M);
        System.out.println(result);
    }

    static int search(int[] arrN, int N, int M) {
        int result = 0;

        for (int i = 0; i < N - 2; i++) {

            for (int j = 0; j < N - 1; j++) {

                for (int k = 0; k < N; k++) {

                    int tmp = arrN[i] + arrN[j] + arrN[k];

                    if (M == tmp) {
                        return tmp;
                    }

                    if (result < tmp && tmp < M) {
                        result = tmp;
                    }
                }
            }
        }
        return result;
    }
}
