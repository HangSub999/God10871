import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[24];

        for (int i=1;i<=n;i++){
            int r=sc.nextInt();
            arr[r]++;
        }
        for (int i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
