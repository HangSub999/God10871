package Programmers;

import java.util.HashSet;
import java.util.Set;

public class Lv1_37 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(nums));
    }
//폰캣몬
    static public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int sum = nums.length / 2;
        return Math.min(sum, set.size());
    }
}
