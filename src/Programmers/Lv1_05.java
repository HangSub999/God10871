package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Lv1_05 {
    public static void main(String[] args) {

        System.out.println(solution(11));
    }
//하샤드 수
    static public boolean solution(int x) {
        int sum = 0;
        int xs = x;
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            list.add(x % 10);
            x /= 10;
        }
        for (Integer a : list) {
            sum += a;
        }
        return xs % sum == 0;
    }
}
