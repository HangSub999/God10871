import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= sc.nextInt();

        for (int i=0;i<n;i++){
            int x= sc.nextInt();
            System.out.print(x+" ");
            if (x>a){// 숫자 비교를 어떻게 해야 할까
                System.out.print(x+" dd ");
            }
        }
    }
}
