package Programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lv1_36 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array, commands));
    }
//k번째수
    static public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> lists = new ArrayList<>();
        for (int[] command : commands) {
            List<Integer> list = new ArrayList<>();
            for (int j = command[0] - 1; j < command[1]; j++) {
                list.add(array[j]);
            }
            list.sort(Comparator.naturalOrder());
            if (list.size() < 2) {
                lists.add(list.get(0));
            } else {
                lists.add(list.get(command[2] - 1));
            }
        }
        return lists;
    }
}
