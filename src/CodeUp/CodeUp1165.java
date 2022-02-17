package CodeUp;

import java.util.*;
public class CodeUp1165 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int s= sc.nextInt();

        if (t>=0 && 90>t){
            s++;
            s+= (89-t)/5;

            System.out.println(s);
        }
    }
}
