package FastCampus;

public class Student2 {

    int sutdentId;
    String sutdentName;

    Subject korea;
    Subject math;

    public Student2(int sutdentId, String sutdentName) {
        this.sutdentId = sutdentId;
        this.sutdentName = sutdentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int scoer) {
        korea.subjectName = name;
        korea.score = scoer;

    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() {
        int total = korea.score + math.score;

        System.out.println(sutdentName + "학생의 총점은 : " + total + "입니다.");
    }
}
