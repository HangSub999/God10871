package Programmers;

public class Lv1_18 {
    public static void main(String[] args) {
        String[] str = {"Jane", "Kim"};
        System.out.println(solution(str));
    }

   static public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}
