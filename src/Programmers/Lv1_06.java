package Programmers;

public class Lv1_06 {
    public static void main(String[] args) {

    }
//평균 구하기
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        answer = (double) sum / arr.length;
        return answer;
    }
}
