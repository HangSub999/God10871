package Programmers;

public class Lv1_29 {
    public static void main(String[] args) {

        System.out.println(solution(3, 20, 4));
    }

    // 부족한 금액 계산기
    static public long solution(int price, int money, int count) {
        int[] tmp = new int[count];
        long total = 0;
        for (int i = 1; i <= count; i++) {
            tmp[i - 1] = price * i;
        }
        for (int sum : tmp) {
            total += sum;
        }

        if (money > total) {
            return 0;
        } else {
            return total - money;
        }

    }
}
