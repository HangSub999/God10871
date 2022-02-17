package SungJun_Misson;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a*b*c;
        int [] arr = {10};


       while (sum<0){
           sum %= 10;
           if (arr[0] == sum){

           }
       }



    }
}
