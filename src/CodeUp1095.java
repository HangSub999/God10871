import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            arr[i] = r;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
}
