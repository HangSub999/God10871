package CodeUp;

import java.util.*;
public class CodeUp1173 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t= sc.nextInt();
        int m= sc.nextInt();

       if (m<30){
           --t;
           m=60-(30-m);
           if (t<0){
               t =23;
           }
           System.out.println(t+" "+m);
       }else {
           System.out.println(t+" "+(m-30));
       }

    }
}
