package FastCampus.ch02_24;

public class StudentMain {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kin");

        studentLee.addSubject("국어", 70);
        studentLee.addSubject("수학", 85);
        studentLee.addSubject("수학", 100);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();

    }
}
