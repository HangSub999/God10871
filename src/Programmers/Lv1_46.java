package Programmers;

public class Lv1_46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        System.out.println(solution(nums));
    }
// 소수 만들기
    static public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (is_prime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean is_prime(int sum) {
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
