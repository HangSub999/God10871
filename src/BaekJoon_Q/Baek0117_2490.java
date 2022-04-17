package BaekJoon_Q;

import java.util.Scanner;

public class Baek0117_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] youtArr = new int[3][4];
        int[] cont = new int[3];
        String[] ABC = {"A", "B", "C", "D", "E"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                youtArr[i][j] = sc.nextInt();
                if (youtArr[i][j] == 0) {
                    cont[i]++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cont[i] == 1) {
                System.out.println(ABC[0]);
            } else if (cont[i] == 2) {
                System.out.println(ABC[1]);
            } else if (cont[i] == 3) {
                System.out.println(ABC[2]);
            } else if (cont[i] == 4) {
                System.out.println(ABC[3]);
            } else {
                System.out.println(ABC[4]);
            }
        }

    }
}
