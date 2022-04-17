package BaekJoon_Q;

import java.util.Scanner;

public class Baek0119_2386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {  //무한루프
            String end = sc.nextLine(); //한줄씩 입력 받기
            String end2 = end.toLowerCase(); //입력받은 값 소문자로 변환

            if (end.equals("#")) { //만약 #이 입력되면 무한루프 종료
                System.exit(0);
            }

            int cnt = 0;          //개수 파악
            for (int i = 1; i < end.length(); i++) {

                if (end.charAt(0) == end2.charAt(i)) {
                    cnt++;
                }
            }
            System.out.println(end.charAt(0) + " " + cnt);


        }
    }
}
