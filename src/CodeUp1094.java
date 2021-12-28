import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int []arr=new int[n+1];
        for (int i=1;i<=n;i++){
            int r=sc.nextInt();
            arr[i]=r;
        }
        for (int i=n;i>=1;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
