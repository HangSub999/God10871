package SungJun_Misson;

import java.util.Scanner;

public class Baek0110_1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int sum = 1;
        while (N >= 1) {
            if (N < sum) {
                sum = 1;
            }
            N = N - sum;
            sum++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
//답지 참고 이해 완료.