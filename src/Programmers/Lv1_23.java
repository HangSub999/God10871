package Programmers;

public class Lv1_23 {
    public static void main(String[] args) {

        System.out.println(solution(3, 3));
    }

    static public long solution(int a, int b) {
        long answer = 0;
        long max = 0;
        long min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        for (long i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
