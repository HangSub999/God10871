package SungJun_Misson;

import java.util.Scanner;

public class Beak0401_11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String[] narry = n.split(" ");

        int na = Integer.parseInt(narry[0]);

        for (int i = 0; i < na; i++) {
            String str = sc.nextLine();

            for (int j = str.length() - 1; j >= 0; j--) {
                char cha = str.charAt(j);
                System.out.print(cha);
            }
            System.out.println();
        }

    }
}
