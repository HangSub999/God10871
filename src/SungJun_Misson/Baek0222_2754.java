package SungJun_Misson;

import java.util.Scanner;

public class Baek0222_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArray = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] strD = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(str)) {
                System.out.println(strD[i]);
                break;
            }
        }
    }
}
