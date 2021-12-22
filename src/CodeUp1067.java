import java.util.*;
public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        if (n>0 && n%2==0){
            System.out.println("양수");
            System.out.println("짝수");

        }else if (n<0 && n%3==0){
            System.out.println("음수");
            System.out.println("홀수");
        }else if (n>0 && n%3==0){
            System.out.println("양수");
            System.out.println("홀수");
        }else if(n<0 && n%2==0){
            System.out.println("음수");
            System.out.println("짝수");
        }
    }
}
