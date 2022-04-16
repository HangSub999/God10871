package SungJon_Test.ReEnter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] storage = new int[3];

        boolean stop = true;

        while (stop) {

            System.out.println("----랜덤 숫자 생성----");

            for (int i = 0; i < 3; i++) {
                int random = (int) (Math.random() * 10) + 1;
                storage[i] = random;
                System.out.print(random + " ");
            }
            System.out.println();


            System.out.println("번호를 입력해 주세요 (1,2,3,4)");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("-----다시 입력------");
            } else if (n == 2) {
                stop = false;
            } else if (n == 3) {
                System.out.println(Arrays.toString(storage));
                System.out.println("숫자 가져오기 완료!");
            } else if (n == 4) {
                System.out.println("----현재 숫자 출력----");
                System.out.println(Arrays.toString(storage));
                do {
                    System.out.println("아무 키를 입력하면 재실행 합니다.");
                } while (!sc.hasNext());
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
}
