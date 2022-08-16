package BaekJoon_Q;

import java.util.Scanner;

public class Q13305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] city = new long[(int) (scanner.nextLong() - 1)];
        long[] gas = new long[city.length + 1];

        for (int i = 0; i < city.length; i++) {
            city[i] = scanner.nextLong();
        }
        for (int i = 0; i < gas.length; i++) {
            gas[i] = scanner.nextLong();
        }
        long money = gas[0] * city[0];
        long min = gas[0];
        for (int i = 1; i < city.length; i++) {
            if (min > gas[i]) {
                min = gas[i];
            }
            money += min * city[i];
        }
        System.out.println(money);
    }
}
