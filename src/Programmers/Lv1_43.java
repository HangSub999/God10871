package Programmers;

import java.util.Arrays;

public class Lv1_43 {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 3, 4, 5, 6};
        int[] win_nums = {7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
        // 1등 6개 , 2등 5개 , 3등 4개 , 4등 3개 , 5등 2개 6등 1개 or 0 개
    }

    //로또의 최고 순위와 최저 순위
    static public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winCount = 0;
        for (int lotto : lottos) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lotto == win_nums[j]) {
                    win_nums[j] = -1;
                    winCount++;
                }
            }
        }
        int winCount2 = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == 0 && win_nums[j] != -1) {
                    lottos[i] = win_nums[j];
                    win_nums[j] = -1;
                    winCount2++;
                }
            }
        }
        if (winCount + winCount2 == 6) {
            answer[0] = 1;
        } else if (winCount + winCount2 == 5) {
            answer[0] = 2;
        } else if (winCount + winCount2 == 4) {
            answer[0] = 3;
        } else if (winCount + winCount2 == 3) {
            answer[0] = 4;
        } else if (winCount + winCount2 == 2) {
            answer[0] = 5;
        } else if (winCount + winCount2 <= 1) {
            answer[0] = 6;
        }

        if (winCount <= 1) {
            answer[1] = 6;
        } else if (winCount == 2) {
            answer[1] = 5;
        } else if (winCount == 3) {
            answer[1] = 4;
        } else if (winCount == 4) {
            answer[1] = 3;
        } else if (winCount == 5) {
            answer[1] = 2;
        } else if (winCount == 6) {
            answer[1] = 1;
        }
        return answer;
    }
}
