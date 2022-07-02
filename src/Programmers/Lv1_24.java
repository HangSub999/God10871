package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lv1_24 {
    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int aa : arr) {
            if (aa % divisor == 0) {
                list.add(aa);
            }
        }
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }


        return answer;
    }
}
