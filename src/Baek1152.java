import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringTokenizer str2 = new StringTokenizer(str, " ");
        System.out.println(str2.countTokens());
    }
}
