package Programmers;


import java.util.Arrays;

public class Lv1_03 {
    public static void main(String[] args) {

        int[][] a1 = {{1,2}};
        int[][] a2 = {{3,4}};

        System.out.println(Arrays.deepToString(solution(a1,a2)));

    }
//행열의 덧셈
    static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int k = 0; k < arr1[0].length; k++) {
                answer[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        return answer;

    }
}
