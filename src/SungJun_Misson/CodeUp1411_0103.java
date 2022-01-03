package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1411_0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) { // 이 부분은 해답 봄
            if (arr[i] != i + 1 || arr[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }

}


