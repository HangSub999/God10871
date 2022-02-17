package CodeUp;

import java.util.Scanner;

public class CodeUp1430_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        int[] arr = new int[test];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int test1 = scanner.nextInt();
        int[] arr1 = new int[test1];

        for (int i = 0; i < test1; i++) {
            int num = scanner.nextInt();
            for (int j = 0; j < test; j++) {
                if (arr[j] == num) {
                    arr1[i] = 1;
                    break;
                }
            }
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static int asdasdasd(int a, int b) {
        return a * b;
    }
}
