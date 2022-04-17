package BaekJoon_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class Baek0205_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }

        for (int i = 0; i < arr.size(); i++) {

            int con = 0;
            int sum = 0;

            for (int j = 0; j < arr.get(i).length(); j++) {

                if (arr.get(i).charAt(j) == 'O') {
                    con++;
                } else {
                    con = 0;
                }
                sum += con;
            }
            System.out.println(sum);
        }

    }
}
