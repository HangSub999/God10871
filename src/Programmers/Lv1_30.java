package Programmers;

public class Lv1_30 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    // 나머지가 1이 되는 수 찾기
    static public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
