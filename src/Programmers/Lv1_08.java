package Programmers;

public class Lv1_08 {
    //짝수와 홀수
    public String solution(int num) {
        String answer = "";
        answer = num % 2 == 0 ? "Even" : "Odd";
        return answer;
    }
}
