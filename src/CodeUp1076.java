import java.util.*;
public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;

        for (int i=1;i<=n;i++){
            if (i%2==0){
               num=num+i;
            }
        }
        System.out.println(num);



    }
}
