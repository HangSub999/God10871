package SungJun_Misson;

import java.util.Scanner;

public class Baek0203_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            if (one == 0 && two == 0) {
                break;
            }
            if (one > two) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
