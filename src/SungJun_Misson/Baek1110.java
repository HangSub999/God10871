package SungJun_Misson;

import java.util.*;
public class Baek1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt=0;
        int copy=n;

        do {
            n = ((n%10)*10)+(((n/10)+(n%10))%10);
            cnt++;

            }while (copy != n);
        System.out.println(cnt);
        }
    }

