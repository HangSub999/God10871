import java.util.*;
public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int d= sc.nextInt();
        int n= sc.nextInt();

        for (int i=2;i<=n;i++){
            a=a+d;
            if (i==n){
                System.out.println(a);
            }
        }
    }
}
