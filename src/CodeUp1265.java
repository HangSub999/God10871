import java.util.Scanner;
public class CodeUp1265 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        while (n<10){
            for (int i=1;i<=9;i++){
                System.out.println(n+"*"+i+"="+n*i);
            }break;

        }
    }
}
