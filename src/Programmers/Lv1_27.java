package Programmers;

public class Lv1_27 {
    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }
//가운데 글자 가져오기
    static public String solution(String s) {
        String answer;
        int sum = (s.length() / 2);
        if (s.length() % 2 != 0) {
            answer = s.substring(sum, sum + 1);
        } else {
            answer = s.substring(sum - 1, sum + 1);
        }
        return answer;
    }
}
