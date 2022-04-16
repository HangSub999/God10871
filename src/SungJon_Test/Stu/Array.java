package SungJon_Test.Stu;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public List<Integer> list;

    private int 주민번호;

    public Array() {
        this.list = new ArrayList<>();
    }

    public Array(int 주민번호) {
        this.주민번호 = 주민번호;
    }


    public void arrayAdd(int num) {
        this.list.add(num);
    }

}
