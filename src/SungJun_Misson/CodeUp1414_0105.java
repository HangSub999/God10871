package SungJun_Misson;

import java.util.Scanner;

public class CodeUp1414_0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        char[] arr = str.toCharArray();

        int count = 0;
        int count2 = 0;
        String[] cc = new String[arr.length - 1];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                cc[i] = String.valueOf(arr[i] + arr[i + 1]);
            }

            if (arr[i] == 'c') {
                count++;
            } else if (cc[i] == "cc") {
                count2++;
            }
        }
        System.out.println(count);
        System.out.println(count2);
    }
}
