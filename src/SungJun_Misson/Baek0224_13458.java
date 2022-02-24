package SungJun_Misson;

import java.util.Scanner;

public class Baek0224_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testSite = sc.nextInt();
        int[] personnel = new int[testSite];
        long count = 0;

        for (int i = 0; i < testSite; i++) {
            personnel[i] = sc.nextInt();
        }
        int superVisor = sc.nextInt();
        int deSuperVisor = sc.nextInt();

        for (int i = 0; i < testSite; i++) {
            personnel[i] -= superVisor;
            count++;
            while (personnel[i] > 0) {
                personnel[i] -= deSuperVisor;
                count++;
            }
        }
        System.out.println(count);
    }
}
