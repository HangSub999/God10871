package BaekJoon_Q;

import java.util.Scanner;

public class Baek0430_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fixation = sc.nextInt();
        int cost = sc.nextInt();
        int price = sc.nextInt();

        int sum = price - cost;
        if (sum > 0) {
            fixation += sum;
            System.out.println(fixation / sum);
        } else {
            System.out.println(-1);
        }
    }
}
