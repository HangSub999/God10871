package Programmers;

import java.util.Arrays;

public class Lv1_32 {
    public static void main(String[] args) {
        int[] test = {2, 2, 3, 3};
        System.out.println(solution(test, 10));
    }

    //예산
    static public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for (int num : d) {
            if (budget < num) {
                break;
            }
            budget -= num;
            count++;
        }
        return count;
    }
}
