package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1410_0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] cha = new char[str.length()];
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < str.length(); i++) {
            cha[i] = str.charAt(i);
            if (cha[i] == '(') {
                cnt++;
            } else if (cha[i] == ')') {
                cnt2++;
            }
        }
        System.out.println(cnt + " " + cnt2);
    }
}
