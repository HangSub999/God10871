package Programmers;

import java.util.*;

public class Lv1_22 {
    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(str, 1)));
    }

    static public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();

        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}
