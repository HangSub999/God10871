package CodeUp;

import java.util.*;
public class CodUp1080 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;

        for (int i=1;i<=n;i++){
            sum=sum+i;
            if (sum>=n){
                System.out.println(i);
                break;
            }
        }
    }
}
