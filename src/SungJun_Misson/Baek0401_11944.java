package SungJun_Misson;

import java.util.Scanner;

public class Baek0401_11944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        String nStr = "";

        for (int i = 0; i < N; i++) {
            nStr += N;
        }

        if (nStr.length() > M) {
            System.out.println(nStr.substring(0, M));
        } else {
            System.out.println(nStr);
        }

    }
}

