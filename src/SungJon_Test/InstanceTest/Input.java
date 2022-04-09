package SungJon_Test.InstanceTest;

import java.util.Scanner;

public class Input {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int 학생수입력하기() {
        System.out.println("학생수를 입력해주세요");
        return SCANNER.nextInt();
    }

    public static String 학생이름입력하기() {
        System.out.println("학생 이름을 입력해주세요");
        return SCANNER.next();
    }

    public static int 학생점수를입력해주세요() {
        System.out.println("학생 점수를 입력해주세요");
        return SCANNER.nextInt();
    }

    public static String 과목이름을입력해주세요() {
        System.out.println("과목이름을 입력해주세요");
        return SCANNER.next();
    }

}
