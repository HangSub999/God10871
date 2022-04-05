package FastCampus;

public class OperatorTest5 {
    public static void main(String[] args) {
        int javaScore = 83;
        String str = (javaScore > 60) ? "합격" : "불합격";
        System.out.println("java 시험 결과 : " + str);

        int pythonScore = 55;
        String result = (pythonScore > 60) ? "합격" : "불합격";
        System.out.println("Python 시험 결과 : " + result);
    }

}
