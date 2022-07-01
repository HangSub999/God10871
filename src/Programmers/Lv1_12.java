package Programmers;

public class Lv1_12 {
    public static void main(String[] args) {

        System.out.println();
    }

    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arry = str.split("");
        int[] answer = new int[str.length()];

        for (int i = 1; i <= str.length(); i++) {
            int count = str.length() - i;
            answer[i - 1] = Integer.parseInt(arry[count]);

        }
        return answer;
    }
}

