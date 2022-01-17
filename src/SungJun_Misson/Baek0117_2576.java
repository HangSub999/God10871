package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0117_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];  //정수 입력
        int[] cunt = new int[7]; //홀수만 저장

        int sum = 0;  //홀수 더한값 저장
        int min = 0;  //홀수 중 최소값 저장
        int hol = 0;  //짝수 개수 저장

        for (int i = 0; i < 7; i++) {   //정수 7개 num배열에 저장
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) { //짝수 개수 카운트
            if (num[i] % 2 == 0) {
                hol++;
            }
        }
        for (int i = 0; i < 7; i++) { //홀수를 판별후 더한 값을 sum에 저장

            if (num[i] % 2 == 1) {

                cunt[i] = num[i];

                sum += cunt[i];
            }
        }
        Arrays.sort(cunt);            //오름차순 정렬
        for (int i = 0; i < 7; i++) {
            if (7 == hol) {        //짝수가 7개이면 -1 출력 후 반복문 종료
                System.out.println(-1);
                break;
            } else if (cunt[i] > min) {  //짝수가 7개가 아니면 홀수중 작은 수, 홀수를 모두 더한 값 출력
                min = cunt[i];
                System.out.println(sum);
                System.out.println(min);
                break;
            }
        }

    }
}
