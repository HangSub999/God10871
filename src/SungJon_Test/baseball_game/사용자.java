package SungJon_Test.baseball_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 사용자 {

    private Scanner sc;
    private List<Integer> arrayList;

    public 사용자() {
        this.sc = new Scanner(System.in);
        this.arrayList = new ArrayList<>();
    }

    public List<Integer> getArrayList() {
        return arrayList;
    }

    public int getSc() {
        return sc.nextInt();
    }

    public String 사용자입력값() {
        for (int i = 0; i < 3; i++) {
            this.arrayList.add(sc.nextInt());
        }
        return arrayList.toString();
    }

}
