package Programmers;

import java.util.*;

public class Lv1_25 {
    public static void main(String[] args) {
        int[] i = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(i)));
    }

    static public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int tmp = -1;

        for (int j : arr) {
            if (j != tmp) {
                list.add(j);
                tmp = j;
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
