package FastCampus;

public class OperatorTest5_1 {
    public static void main(String[] args) {
        int score = 83;
        String str = (score > 60) ? "합격" : "불합격";
        System.out.println("java 시험 결과 : " + str);

        score = 55;
        str = (score > 60) ? "합격" : "불합격";
        System.out.println("Python 시험 결과 : " + str);
    }
}
