package Programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lv1_11 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
//정수 내림차순으로 배치하기
    static public long solution(long n) {
        List<Integer> list = new ArrayList<>();
        String str = String.valueOf(n);
        String[] strs = str.split("");

        for (String a : strs) {
            list.add(Integer.valueOf(a));
        }
        list.sort(Comparator.reverseOrder());
        StringBuilder str2 = new StringBuilder();
        for (Integer a : list) {
            str2.append(a);
        }

        return Long.parseLong(str2.toString());
    }
}
