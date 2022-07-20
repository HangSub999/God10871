package Programmers;

public class Lv1_40 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));
    }
//음양 더하기
    static public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }
}
