package BaekJoon_Q;

import java.util.ArrayList;
import java.util.Scanner;

public class Baek2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrN = new ArrayList<Integer>();

        for (int i = 0; i < 9; i++) {
            arrN.add(sc.nextInt());
        }
        int max = 0;
        int cont = 0;

        for (int i = 0; i < 9; i++) {

            if (arrN.get(i) > max) {
                max = arrN.get(i);
                cont = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(cont);
    }
}
