package SungJun_Misson;

import java.util.Scanner;

public class Baek0302_2596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] abc = {"000000", "001111", "010011", "011100", "100110", "101001",
                "110101", "111010"};
        char[] abcCha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char[] charC = new char[n];
        String[] strArry = new String[n];  //입력받은 값 나누기


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 6; j += 6) {
                strArry[i] = str.substring(j, j + 6);
            }
        }
        for (int i = 0; i < strArry.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (strArry[i].equals(abc[j])) {
                    charC[i] = abcCha[j];
                }
                int comt = 0;
                for (int k = 0; k < 6; k++) {
                    char a = strArry[i].charAt(k);
                    char b = abc[j].charAt(k);

                    if (a != b && comt < 1) {
                        charC[i] = abcCha[j];
                        comt++;
                    } else if (a != b && comt > 0) {
                        System.out.println(i + 1);
                        break;
                    }


                }
            }
        }
        for (char cc : charC) {
            System.out.print(cc);
        }

    }
}


