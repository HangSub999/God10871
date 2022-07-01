package Programmers;

public class Lv1_19 {
    public static void main(String[] args) {

    }

    public boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
            }
        }
        if (count == s.length() && s.length() == 4 || s.length() == 6) {
            return answer;
        } else {
            return false;
        }
    }
}
