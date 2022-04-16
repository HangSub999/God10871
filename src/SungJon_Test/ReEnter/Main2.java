package SungJon_Test.ReEnter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>(); //다형성

        boolean stop = true;

        while (stop) {

            arrayList.clear();
            System.out.println("----랜덤 숫자 생성----");
            for (int i = 0; i < 3; i++) {
                int random = (int) (Math.random() * 10) + 1;
                arrayList.add(random);
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();


            System.out.println("번호를 입력해 주세요 (1,2,3,4)");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("-----다시 입력------");
            } else if (n == 2) {
                stop = false;
            } else if (n == 3) {
                System.out.println(arrayList);
                System.out.println("숫자 가져오기 완료!");
            } else if (n == 4) {
                System.out.println("----현재 숫자 출력----");
                System.out.println(arrayList.toString());
                System.out.println("----1,2,3,4 번호 입력해 주세요----");
                boolean stop2 = true;
                while (stop2) {
                    int k = sc.nextInt();
                    if (k == 2) {
                        stop = false;
                        stop2 = false;
                    } else {
                        stop = false;
                        stop2 = false;
                    }
                }
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
}
