package Programmers;


public class Solution {
    public static void main(String[] args) {
        System.out.println(Solutions.solution("try hello world"));

    }

    public static class Solutions {
        public static String solution(String s) {
            String answer = "";
            int cont = 0;
            String[] array = s.split("");

            for (String ss : array) {
                cont = ss.contains(" ") ? 0 : cont + 1;
                answer += cont % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
            }
            return answer;
        }
    }
}

