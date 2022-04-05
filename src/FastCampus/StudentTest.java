package FastCampus;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "인천 미추홀구";

        studentLee.showStudentInfo();
    }
}
