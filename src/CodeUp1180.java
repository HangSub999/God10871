import java.util.*;
public class CodeUp1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum = (n % 10 * 10) + (n / 10);
        sum *= 2;

        if (sum < 100) {
            System.out.println(sum);
            if (sum <= 50) {
                System.out.println("GOOD");
            } else {
                System.out.println("OH MY GOD");
            }

        } else {
            sum %= 100;
            System.out.println(sum);
            if (sum <= 50) {
                System.out.println("GOOD");
            } else {
                System.out.println("OH MY GOD");
            }
        }
    }
}

