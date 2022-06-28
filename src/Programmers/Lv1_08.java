package Programmers;

public class Lv1_08 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    //짝수와 홀수
   static public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
