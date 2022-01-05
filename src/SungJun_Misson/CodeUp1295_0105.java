package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1295_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strC = str.toCharArray();

        for (int i = 0; i < strC.length; i++) {
            if ((int) strC[i] > 96 && (int) strC[i] < 123) {
                strC[i] -= 32;
            } else if ((int) strC[i] > 64 && (int) strC[i] < 91) {
                strC[i] += 32;
            }

        }
        for (char a : strC) {
            System.out.print(a);
        }
    }
}
