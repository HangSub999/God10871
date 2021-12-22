import java.util.*;
public class CodeUp1167 {// 세 개의 정수가 공백으로 구분되어 입력된다.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if ((a>=b && a<=c) || (a<=b && a>=c)){
            System.out.println(a);
        }else if ((b>=a && b<=c) || (b<=a && b>=c)){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
