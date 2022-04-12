package FastCampus.a_lecture_note;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int number1 = 0;
        try {
            number1 = Integer.parseInt("4");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int number2 = Integer.parseInt("12");

        System.out.println("나누기 결과 : " + (number1 / number2));
    }

}
