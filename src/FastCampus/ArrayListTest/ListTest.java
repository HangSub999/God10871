package FastCampus.ArrayListTest;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("학번-00001", "김", 100, "컴퓨터 공학"));
        students.add(new Student("학번-00002", "이", 10, "기계 공학"));
        students.add(new Student("학번-00003", "조", 16, "컴퓨터 공학"));
        students.add(new Student("학번-00004", "박", 20, "기계 공학"));
        students.add(new Student("학번-00005", "시", 50, "컴퓨터 공학"));
        students.add(new Student("학번-00006", "최", 90, "기계 공학"));
        students.add(new Student("학번-00007", "문", 11, "컴퓨터 공학"));

        int sum = 0;
        for (Student student : students) {
            sum += student.studentScore;
        }
        sum /= 7;

        for (Student student : students) {
            if (sum < student.studentScore) {
                student.showStudentInfo();
            }
        }
    }
}
