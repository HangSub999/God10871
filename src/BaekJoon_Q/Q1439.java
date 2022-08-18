package BaekJoon_Q;

import java.util.Scanner;

public class Q1439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split("");
        StringBuilder strTotal = new StringBuilder();

        for (int i = 0; i < strArr.length - 1; i++) {
            if (strArr[i].equals("0")) {
                strTotal.append(strArr[i]);
                if (!strArr[i].equals(strArr[i + 1])) {
                    strTotal.append(" ");
                }
            } else {
                strTotal.append(strArr[i]);
                if (!strArr[i].equals(strArr[i + 1])) {
                    strTotal.append(" ");
                }
            }
        }
        strTotal.append(strArr[strArr.length - 1]);
        int one = 0;
        int zero = 0;
        String[] strSprit = strTotal.toString().split(" ");
        for (String s : strSprit) {
            if (s.contains("0")) {
                zero++;
            } else {
                one++;
            }
        }

        System.out.println(Math.min(one, zero));

    }
}
