package BaekJoon_Q;

import java.util.Scanner;

public class Baek0109_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] arrDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] arrStr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int sum = day;
        for (int i = 0; i < month - 1; i++) {
            sum += arrDay[i];
        }
        System.out.print(arrStr[sum % 7]);
    }
}
//코드는 이해 하는데 문제를 이해 못 하겠음