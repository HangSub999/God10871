package BaekJoon_Q;

import java.util.Scanner;

public class Baek0219_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testK = sc.nextInt();

        while (testK != 0) {
            String A = sc.next();
            String[] arrA = A.split(",");
            int intA = Integer.parseInt(arrA[0]);
            int intB = Integer.parseInt(arrA[1]);
            System.out.println(intA + intB);
            testK--;
        }
    }
}
