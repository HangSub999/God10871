package Programmers;

public class Lv1_17 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

   static public String solution(int n) {
        String s = "수박";
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");
        for (int i = 0; i < n; i++) {
            if (i == s.length()) {
                i = 0;
            }
            if (answer.length() != n) {
                answer.append(str[i]);
            } else {
                break;
            }
        }

        return answer.toString();
    }
}
