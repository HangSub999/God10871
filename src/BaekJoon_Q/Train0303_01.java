package BaekJoon_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class Train0303_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<String>();

        int siz = 0;
        for (int i = 0; i < 5; i++) {
            str.add(sc.next());

            if (str.get(i).length() > siz) {
                siz = str.get(i).length();
            }

        }
        for (String cc : str) {
            if (cc.length() == siz) {
                System.out.println(cc);
                break;
            }
        }
    }
}
