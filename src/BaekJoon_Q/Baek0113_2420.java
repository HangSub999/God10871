package BaekJoon_Q;

import java.util.Scanner;

public class Baek0113_2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long sum = N - M;

        System.out.println(Math.abs(sum)); //Math 절대값 메소드 사용

    }
}
