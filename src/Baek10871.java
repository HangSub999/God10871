import java.util.*;
public class Baek10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (x<b) {
                if (num>x)
                    if (num<b)
                System.out.print(num + " ");

            }else {
                System.out.println(num+" ");
            }

        }
    }
}

