package SungJun_Misson;

import java.util.Scanner;

public class Baek0317_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("END")) {
                System.exit(0);
            }
            for (int i = str.length() - 1; i >= 0; i--) {
                char cha = str.charAt(i);
                System.out.print(cha);
            }
            System.out.println();
        }
    }
}
