package Programmers;

import java.util.Arrays;

public class Lv1_34 {
    public static void main(String[] args) {
        int[] lost = {3, 4};
        int[] reserve = {3};
        System.out.println(solution(5, lost, reserve));
    }
// 체육복
    static public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int total = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    total++;
                    break;
                }
            }
        }

        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if (k + 1 == reserve[j] || k - 1 == reserve[j]) {
                    total++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return total;
    }
}
