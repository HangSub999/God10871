package Programmers;

public class Lv1_49 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        System.out.println(solution(s));
    }

    static public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.toLowerCase().split(" ");

        for (int i = 0; i < str.length; i++) {
            char[] cha = str[i].toCharArray();
            if (cha[0] >= 'a' && cha[0] <= 'z') {
                cha[0] -= 32;
                if (i == str.length - 1) {
                    answer.append(cha);
                } else {
                    answer.append(cha).append(" ");
                }
            } else {
                if (i == str.length - 1) {
                    answer.append(str[i]);
                } else {
                    answer.append(str[i]).append(" ");
                }
            }
        }
        return answer;
    }


}
