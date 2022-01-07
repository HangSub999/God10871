package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1158_0107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 30 && 40 >= n || n >= 60 && 70 >= n) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
