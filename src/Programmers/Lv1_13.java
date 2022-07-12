package Programmers;

import java.util.Arrays;

public class Lv1_13 {
    public static void main(String[] args) {
        int[][] test = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(test));

    }
//최소 직사각형
    static public int solution(int[][] sizes) {
        int max = 0;
        for (int[] size : sizes) {
            for (int i : size) {
                if (i > max) {
                    max = i;
                }
            }
        }

        int[] min = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length - 1; j++) {
                min[i] = sizes[i][j];
                if (sizes[i][j + 1] < min[i]) {
                    min[i] = sizes[i][j + 1];
                }
            }
        }
        Arrays.sort(min);
        return max * min[min.length - 1];
    }
}
