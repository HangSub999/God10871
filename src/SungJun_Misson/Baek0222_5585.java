package SungJun_Misson;

import java.util.Scanner;

public class Baek0222_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 1000 - N;
        int cont = 0;

        while (sum != 0) {
            if (sum >= 500) {
                sum -= 500;
                cont++;
            } else if (sum >= 100) {
                sum -= 100;
                cont++;
            } else if (sum >= 50) {
                sum -= 50;
                cont++;
            } else if (sum >= 10) {
                sum -= 10;
                cont++;
            } else if (sum >= 5) {
                sum -= 5;
                cont++;
            } else if (sum >= 1) {
                sum -= 1;
                cont++;
            }
        }
        System.out.println(cont);

    }
}
