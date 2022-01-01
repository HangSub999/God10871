package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1405_0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];


        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
        }
        // 배열을 어떻게 옮길까 시도해 보다가 답이 없어서 해답 찾아봄 이해 완료.+신기함
        for (int i = 0; i < arrN.length; i++) {
            for (int j = i; j < arrN.length; j++) {
                System.out.print(arrN[j] + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(arrN[j] + " ");
            }
            System.out.println();
        }


    }
}

