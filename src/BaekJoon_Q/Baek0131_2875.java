package BaekJoon_Q;

import java.util.Scanner;

public class Baek0131_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int woman = sc.nextInt();
        int man = sc.nextInt();
        int internship = sc.nextInt();

        int max = ((woman / 2) < man ? (woman / 2) : man);
        internship -= woman + man - (max * 3);

        while (internship > 0) {
            internship = internship - 3;
            max--;
        }
        System.out.println(max);
    }

}
