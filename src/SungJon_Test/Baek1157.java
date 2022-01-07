package SungJon_Test;


import java.util.Scanner;

public class Baek1157 {                                       //해답 카피 이해 완료
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //입력

        int[] arr = new int[26]; //영문자의 개수

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { //대문자 범위
                arr[str.charAt(i) - 'A']++;  //해당 인덱스 값 1 증가
            } else {                       // 소문자 범위
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);  //대문자로 출력하기 위해 +65
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
