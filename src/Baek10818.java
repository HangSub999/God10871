import java.util.*;

public class Baek10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arrN = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {

            arrN.add(sc.nextInt());

        }
        Collections.sort(arrN);
        System.out.println(arrN.get(0) + " " + arrN.get(n - 1));

    }
}
