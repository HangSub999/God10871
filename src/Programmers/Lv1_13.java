package Programmers;

import java.util.Arrays;

public class Lv1_13 {
    public static void main(String[] args) {
        int[][] test = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        System.out.println(solution(test));

    }

    static public int solution(int[][] sizes) {
        int[][] max = new int[1][2];
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[0].length; j++) {
                if (max[0][0] < sizes[i][0]) {
                    max[0][0] = sizes[i][0];
                }
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[1].length; j++) {
                if (max[0][1] < sizes[i][1]) {
                    max[0][1] = sizes[i][1];
                }
            }
        }
        System.out.println(Arrays.deepToString(max));
        return max[0][0] * max[0][1];
    }
}
