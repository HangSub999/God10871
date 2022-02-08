package SungJun_Misson;

import java.util.Scanner;

public class Baek0205_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {

            int con = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    con++;
                } else {
                    con = 0;
                }
                sum += con;
            }
            System.out.println(sum);
        }

    }
}
