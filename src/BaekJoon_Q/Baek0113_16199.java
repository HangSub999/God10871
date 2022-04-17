package BaekJoon_Q;

import java.util.Scanner;

public class Baek0113_16199 {   //...답지 참고 한것임
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int[] m = new int[3];

        int maa = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        int age = m[0] - n[0];
        int s = age + 1;
        int y = age;

        if (age != 0) {
            if (m[1] > n[1]) {
                maa = age;
            } else if (m[1] < n[1]) {
                maa = age - 1;
            } else {
                if (m[2] < n[2]) {
                    maa = age - 1;
                } else if (m[2] >= n[2]) {
                    maa = age;
                }
            }
        }
        System.out.println(maa);
        System.out.println(s);
        System.out.println(y);

    }
}
