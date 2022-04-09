package SungJon_Test.InstanceTest;

public class Subject {

    private String subjectName;
    private int score;

    public Subject() {
        this.subjectName = "입력값이 없습니다";
        this.score = 0;
    }

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public int getScore() {
        return this.score;
    }


}
