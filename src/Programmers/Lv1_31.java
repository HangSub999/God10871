package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lv1_31 {
    public static void main(String[] args) {
        int[] test = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(test)));
    }
// 두개 뽑아서 더하기
    static public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] tmp = set.toArray(new Integer[0]);
        int[] answer = new int[tmp.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}
