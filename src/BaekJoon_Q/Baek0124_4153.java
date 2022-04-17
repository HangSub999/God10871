package BaekJoon_Q;

import java.util.Scanner;

public class Baek0124_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            } else if (a * a == (b * b) + (c * c) ||    //직삼각형 구하는 식만 참고
                    b * b == (a * a) + (c * c) ||
                    c * c == (b * b) + (a * a)) {

                System.out.println("right");

            } else {
                System.out.println("wrong");
            }


        }
    }
}
