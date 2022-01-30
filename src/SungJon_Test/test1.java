package SungJon_Test;

import java.util.Scanner;

public class test1 {

    public static final int MAX_INT = 0;

    public int 성준;

    public test1() {
        this.성준 = 90;
    }


    public test1(int asd) {
        성준 = asd;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 성준 = scanner.nextInt(); //5
        int 항섭 = scanner.nextInt(); //7

        test1 test1 = new test1(60);
        int num = test1.sum(성준, 항섭); // 10;
        System.out.println(num);

    }


    public int sum(int 항섭, int 성준) {
        return 항섭 - 성준;
    }
}
