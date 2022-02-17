package SungJun_Misson;

import java.util.*;
public class Baek10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = 0;

        while (num<5){
            num++;

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (num<5){
                break;
            }
            System.out.println(a+b);

        }
    }
}
