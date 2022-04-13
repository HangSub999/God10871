package FastCampus.ArrayListTest;

public class Student {

    String studentID;
    String studentName;
    int studentScore;
    String studentSubject;

    public Student(String studentID, String studentName, int studentScore, String studentSubject) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentScore = studentScore;
        this.studentSubject = studentSubject;
    }

    public void showStudentInfo() {
        System.out.println("학생의 이름은 :" + studentName + ", 전공은 :" + studentSubject + ", 점수는 :" + studentScore + " 입니다.");
    }
}
