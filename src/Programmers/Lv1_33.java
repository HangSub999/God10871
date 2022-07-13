package Programmers;

public class Lv1_33 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }
//3진법 뒤집기
    static public int solution(int n) {
        String[] str = Integer.toString(n, 3).split("");
        StringBuilder str2 = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            str2.append(str[i]);
        }

        return Integer.parseInt(String.valueOf(str2), 3);
    }
}
