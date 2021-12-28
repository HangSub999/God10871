import java.util.Scanner;

public class CodeUp1430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arrn = new int[n];


        for (int i = 0; i < n; i++) {
            arrn[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrm = new int[m];
        for (int i = 0; i < m; i++) {
            arrm[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            boolean bool = false;

            for (int j = 0; j < n; j++) {
                if (arrm[i] == arrn[j]) {
                    bool = true;
                    break;
                }
            }
            if (bool) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }
    }
}

