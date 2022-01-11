package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0111_1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum += (N + 1) * i;
        }
        System.out.println(sum);
    }
}//답지 참고 코드 이해 완료. 계산 로직을 생각 했는데 이 코드는 규칙을 파악하여 코드 작성.
