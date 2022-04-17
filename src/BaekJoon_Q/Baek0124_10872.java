package BaekJoon_Q;

import java.util.Scanner;

//문제를 이해하지 못해 답지 참고
public class Baek0124_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;

        while (N != 0) {
            sum = sum * N;
            N--;
        }
        System.out.println(sum);
    }
}
