package BaekJoon_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class Train0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            str.add(sc.next());
            for (int j = 0; j < str.get(i).length(); j++) {
                if (str.get(i).charAt(j) == '김') {
                    System.out.println(str.get(i) + " ");
                }
            }
        }

    }
}
