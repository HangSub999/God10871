package BaekJoon_Q;

import java.util.Scanner;

public class Baek0228_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] color = new String[3];

        String[] str = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "grey", "white"};

        int[] sum = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000,
                100000000, 1000000000};
        int tmp = 0;
        int to = 0;

        for (int i = 0; i < color.length; i++) {
            color[i] = sc.next();
        }

        for (int i = 0; i < str.length; i++) {
            if (color[0].equals(str[i])) {
                to += i;
            } else if (str[i].equals(color[1])) {
                to += i;
            } else if (str[i].equals(color[2])) {
                tmp = to * sum[i];
            }
        }
        System.out.println(to);
    }
}
