package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_48 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    static public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int[] count = new int[id_list.length];
        for (int i = 0; i < 중복제거(report).size(); i++) {
            String[] str = 중복제거(report).get(i).split(" ");
            System.out.println(Arrays.toString(str));
        }
        return answer;
    }

    public static List<String> 중복제거(String[] report) {
        List<String> list = new ArrayList<>();
        list.add(report[0]);
        for (int i = 0; i < report.length; i++) {
            for (int j = i + 1; j < report.length; j++) {
                if (!report[i].equals(report[j])) {
                    list.add(report[j]);
                    break;
                }
            }
        }
        return list;
    }
}
