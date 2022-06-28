package Programmers;

import java.util.Scanner;
//직사각형 별찍기
public class Lv1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            for(int k = 0; k < n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
