package SungJon_Test.baseball_game;

public class 컴퓨터 {

    private int 랜덤숫자;

    public 컴퓨터() {
        this.랜덤숫자 = (int) (Math.random() * 9) + 3;
    }

    public int get랜덤숫자() {
        return 랜덤숫자;
    }
}
