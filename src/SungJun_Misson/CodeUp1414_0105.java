package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1414_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 문자열 입력
        String str2 = str.toLowerCase(); // 입력받은 문자열 소문자로 변환
        char[] arr = str2.toCharArray(); //변환된 문자열을 문자형 배열로 변환
        boolean cc = str.contains("cc");
        boolean cC = str.contains("cC");
        boolean Cc = str.contains("Cc");
        boolean CC = str.contains("CC");
        int count = 0;
        int count2 = 0;

        //풀지 못함
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'c') {
                count++;
            }
        }
        for (int i = 1; i < str.length(); i++) {
            if (cc) {
                count2++;
            } else if (cC) {
                count2++;
            } else if (Cc) {
                count2++;
            } else if (CC) {
                count2++;
            }

        }
        System.out.println(count);
        System.out.print(count2);
    }
}
