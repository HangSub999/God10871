package BaekJoon_Q;

import java.util.Scanner;

public class Baek0130_10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        int zeroCout = 0;
        int oneCout = 0;

        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
            if (arrN[i] == 0) {
                zeroCout++;
            } else if (arrN[i] == 1) {
                oneCout++;
            }
        }
        if (zeroCout > oneCout) {
            System.out.println("Junhee is not cute!");
        } else if (zeroCout < oneCout) {
            System.out.println("Junhee is cute!");
        }

    }
}
