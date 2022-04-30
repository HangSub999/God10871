package BaekJoon_Q;

import java.util.Scanner;

public class Baek0430_1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int sum1 = 0;
        int count = 0;

        while (true) {
            if (num >= 10) {
                num1 = num % 10; // 뒷자리
                num2 = num / 10;

                sum = num2 + num1;
                sum1 = sum % 10; // 뒷자리

                num = num1 + sum1;

                count++;

                if (num)

            } else {
                num += num1;
                count++;
                break;
            }
        }

    }
}
