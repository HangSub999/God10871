package Programmers;

public class Lv1_44 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
//키패드 누르기
    static public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int L = 10;
        int R = 12;
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                L = number;
                answer.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                R = number;
                answer.append("R");
            } else {
                if (number == 0) {
                    number = 11;
                }
                int lCount = Math.abs(number - L) / 3 + Math.abs(number - L) % 3;
                int rCount = Math.abs(number - R) / 3 + Math.abs(number - R) % 3;
                if (lCount < rCount) {
                    L = number;
                    answer.append("L");
                } else if (lCount > rCount) {
                    R = number;
                    answer.append("R");
                } else {
                    if (hand.equals("left")) {
                        L = number;
                        answer.append("L");
                    } else {
                        R = number;
                        answer.append("R");
                    }
                }
            }
        }
        return answer.toString();
    }
}
