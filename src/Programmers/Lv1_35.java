package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_35 {
    public static void main(String[] args) {
        int[] test = {1, 3, 2, 4, 2};
        System.out.println(solution(test));
    }
// 모의고사
    static public List<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int j : answers) {
            if (count1 == num1.length) {
                count1 = 0;
            }
            if (j == num1[count1]) {
                score[0]++;
            }
            count1++;
        }
        answer[0] = score[0];
        for (int j : answers) {
            if (count2 == num2.length) {
                count2 = 0;
            }
            if (j == num2[count2]) {
                score[1]++;
            }
            count2++;
        }
        answer[1] = score[1];
        for (int j : answers) {
            if (count3 == num3.length) {
                count3 = 0;
            }
            if (j == num3[count3]) {
                score[2]++;
            }
            count3++;
        }
        answer[2] = score[2];
        Arrays.sort(answer);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (answer[2] == score[i]) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
