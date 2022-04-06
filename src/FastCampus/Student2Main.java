package FastCampus;

public class Student2Main {
    public static void main(String[] args) {

        Student2 student2Lee = new Student2(100, "Lee");

        student2Lee.setKoreaSubject("국어", 100);
        student2Lee.setMathSubject("수학", 90);
        student2Lee.showScoreInfo();

        Student2 student2Raa = new Student2(200, "Raa");

        student2Raa.setKoreaSubject("국어", 50);
        student2Raa.setMathSubject("수학", 50);
        student2Raa.showScoreInfo();
    }
}
