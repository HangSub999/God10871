package SungJon_Test.ReEnter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] storage = new int[3];
        boolean set = true;
        while (set) {

            int count = 3;
            for (int i = 0; i < 3; i++) {
                int randam = (int) (Math.random() * 10) + 1;
                storage[i] = randam;
                System.out.print(randam + " ");
            }

            System.out.println();
            System.out.println("번호를 입력해 주세요");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("다시 입력");
                continue;

            } else if (n == 2) {
                break;
            } else if (n >= 3) {
                System.out.println("잘못 입력하셨습니다 다시 입력해 주세요");
                if (count == 3) {
                    System.out.println(Arrays.toString(storage));
                }

                continue;
            }

        }
    }
}
