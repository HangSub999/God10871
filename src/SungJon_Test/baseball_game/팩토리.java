package SungJon_Test.baseball_game;

import java.util.Scanner;

public class 팩토리 {

    private 컴퓨터 컴;
    private 사용자 사;
    private Scanner sc;

    public 팩토리() {
        this.컴 = new 컴퓨터();
        this.사 = new 사용자();
        this.sc = new Scanner(System.in);
    }

    public String 무한반복() {
        while (사.getSc() != 2) {
            숫자를입력해주세요();
            사.사용자입력값();
            if ()
        }
    }

    public void 숫자를입력해주세요() {
        System.out.println("숫자를 입력해 주세요: ");
    }

    public void 모두맞췄을경우() {
        System.out.println("3개의 숫자를 모두 맞추셨습니다. 게임종료");
        System.out.println("게임 새로시작하려면 1, 종료하려면 2를 입력해 주세요.");

    }
}
