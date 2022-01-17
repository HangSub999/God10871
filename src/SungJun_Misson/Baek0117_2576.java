package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek0117_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];
        int[] cunt = new int[7];
        int tmp = 0;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (num[i] % 3 == 0) {
                tmp = num[i];
                num[i] = cunt[i];
                cunt[i] = tmp;

                sum += cunt[i];
            }
        }
        Arrays.sort(cunt);
        System.out.println(sum);
        System.out.println(cunt[0]);
    }
}
