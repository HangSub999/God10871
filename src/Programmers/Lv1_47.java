package Programmers;

public class Lv1_47 {
    public static void main(String[] args) {
        String s = "23four5six7";
        System.out.println(solution(s));
    }
// 숫자 문자열과 영단어
    static public int solution(String s) {
        String[] strs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strs.length; i++) {
            s = s.replace(strs[i],Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
