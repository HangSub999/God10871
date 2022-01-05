package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1408_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strC = str.toCharArray();
        for (int i = 0; i < strC.length; i++) {
            strC[i] += 2;
            System.out.print(strC[i]);
        }
        System.out.println();
        for (int i = 0; i < strC.length; i++) {
            strC[i] -= 2;
            strC[i] = (char) ((strC[i] * 7) % 80 + 48);
            System.out.print(strC[i]);
        }

    }
}
