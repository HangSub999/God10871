package SungJun_Misson;


import java.util.Arrays;
import java.util.Scanner;

public class Baek0113_2309 {
    public static void main(String[] args) {    //답지 참고
        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[9];
        int sum = 0;
        int A = 0;
        int B = 0;

        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = sc.nextInt();
            sum += arrN[i];
        }
        Arrays.sort(arrN);

        for (int i = 0; i < arrN.length - 1; i++) {
            for (int j = i + 1; j < arrN.length; j++) {
                if (sum - arrN[i] - arrN[j] == 100) {
                    A = i;
                    B = j;
                    break;
                }
            }
        }
        for (int i = 0; i < arrN.length; i++) {
            if (i == A || i == B) {
                continue;
            }
            System.out.println(arrN[i]);
        }
    }
}
