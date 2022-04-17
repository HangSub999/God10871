package BaekJoon_Q;

import java.util.Scanner;

public class Baek0113_3004 {
    public static void main(String[] args) { //수학적 사고가 돌아가지 않아 답지 참고
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int piece = 1;
        int a = 1;
        for (int i = 0; i < N; i++) {
            if (i % 2 != 0) {
                a += 1;
            }
            piece += a;
        }
        System.out.println(piece);
    }
}
