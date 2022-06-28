package Programmers;

public class 시저_암호 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("a B Z", 4));
    }
}

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] array = s.split("");

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(" ") && array[i].charAt(0) >= 'a' && array[i].charAt(0) <= 'z') {
                answer += (array[i].charAt(0) + n);
            } else if (!array[i].equals(" ") && array[i].charAt(0) >= 'A' && array[i].charAt(0) <= 'Z') {
                answer += array[i].charAt(0) + n;
            }
        }
        return answer;
    }
}