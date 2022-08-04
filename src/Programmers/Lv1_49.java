package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Lv1_49 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }

    static public String solution(String s) {
        String answer = " ";
        String[] str = s.toLowerCase().split(" ");
        List<String> strings = new ArrayList<>();
        String[] sArrys = s.split("");
        List<Integer> count = new ArrayList<>();

        for (String value : str) {
            char[] cha = value.toCharArray();
            if (cha[0] >= 'a' && cha[0] <= 'z') {
                cha[0] -= 32;
                strings.add(String.valueOf(cha));
            } else {
                strings.add(String.valueOf(cha));
            }
        }
        System.out.println("대문자로 바꿈 " + strings);
        for (int i = 0; i < sArrys.length; i++) {
            if (sArrys[i].equals(" ")) {
                count.add(i);
            }
        }
        System.out.println("빈 문자열 인덱스 " + count);
//        for (Integer integer : count) {
//            strings.add(integer, " ");
//        }

        return answer;
    }


}
