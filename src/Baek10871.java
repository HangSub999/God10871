import java.util.*;
public class Baek10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (a<b){
                if (num>a)
                    if (num<b)
                    System.out.print(num+" ");
            }else if (a>b){
                if (num<a)
                    if (num>b)
                        System.out.print(num+" ");
            }else
              System.out.println("값이 없습니다.");
            break;

            }

        }
    }


