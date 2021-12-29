import java.util.Scanner;

public class BaekTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i*2-1 ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i=1;i<n;i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int j = (n*2)-(i); j > 0 ; j--) {
                
            }
        }
    }
}
