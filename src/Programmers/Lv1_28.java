package Programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Lv1_28 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));

    }
//2016년
    static public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int day = dayOfWeek.getValue();
        String[] aryDay = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return aryDay[day - 1];
    }
}
