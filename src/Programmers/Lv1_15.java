package Programmers;

public class Lv1_15 {
    public static void main(String[] args) {
        String str = "a B z";
        System.out.println(solution("P", 15));
    }

    static public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] cha = s.toCharArray();

        for (int i = 0; i < cha.length; i++) {
            if (cha[i] >= 'a' && cha[i] <= 'z') {
                if (cha[i] + n > 'z') {
                    int num = n - ('z' - cha[i]);
                    cha[i] = (char) ('a' + (num - 1));
                    answer.append(cha[i]);
                } else {
                    cha[i] += n;
                    answer.append(cha[i]);
                }
            } else if (cha[i] >= 'A' && cha[i] <= 'Z') {
                if (cha[i] + n > 'Z') {
                    int num = n - ('Z' - cha[i]);
                    cha[i] = (char) ('A' + (num - 1));
                    answer.append(cha[i]);
                } else {
                    cha[i] += n;
                    answer.append(cha[i]);
                }
            } else {
                answer.append(cha[i]);
            }
        }
        return answer.toString();
    }
}
