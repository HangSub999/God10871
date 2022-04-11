package FastCampus;

class Student10 {
    String major = "컴퓨터 공학";
}

class UniversityStudent extends Student10 {

    int i = 100;
    int k = 100;
}

public class CastingTest2 {
    public static void main(String[] args) {

        //묵시적 타입 변환
        Student10 student10 = new UniversityStudent();

        //명시적 타입 변환환
        UniversityStudent park = (UniversityStudent) student10;

        System.out.println(park.major);
    }
}

