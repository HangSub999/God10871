package Programmers;

public class Lv1_39 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};
        System.out.println(solution(a, b));
    }

    //내적
    static public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
