package BaekJoon_Q;

import java.util.Scanner;

public class Baek0401_11944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            builder.append(N);
        }

        if (builder.length() > M) {
            System.out.println(builder.substring(0, M));
        } else {
            System.out.println(builder);
        }

    }
}

