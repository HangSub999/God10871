package Programmers;

public class Lv1_41 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution(numbers));
    }

    // 없는 숫자 더하기
    static public int solution(int[] numbers) {
        int sum = 45;
        for (int num : numbers) {
            sum -= num;
        }
        return sum;
    }
}
