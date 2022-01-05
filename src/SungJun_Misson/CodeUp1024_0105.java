package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1024_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String[] arrStr=new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            System.out.printf("\'%c\'\n", str.charAt(i));
        }
    }
}
