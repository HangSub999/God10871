package Programmers;

public class Lv1_02 {
    public static void main(String[] args) {

    }
//x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++) {
            long num = (long) x * i;
            answer[i - 1] = num;
        }
        return answer;
    }
}
