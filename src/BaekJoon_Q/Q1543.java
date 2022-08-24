package BaekJoon_Q;

import java.util.Scanner;

public class Q1543 { //문서 검색
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(scanner.nextLine());
        String str = scanner.nextLine();
        int strLang = str.length();

        int totalCount = 0;
        int index;

        while ((index = stringBuilder.toString().indexOf(str)) != -1) {
            stringBuilder.delete(0, index + strLang);
            totalCount++;
        }

        System.out.println(totalCount);
    }
}
