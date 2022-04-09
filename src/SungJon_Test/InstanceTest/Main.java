package SungJon_Test.InstanceTest;

public class Main {
    public static void main(String[] args) {
        int n = Input.학생수입력하기();
        Stusent[] arr = new Stusent[n];

        for (int i = 0; i < n; i++) {
            String name = Input.학생이름입력하기();
            arr[i] = new Stusent(name, new Subject(Input.과목이름을입력해주세요(), Input.학생점수를입력해주세요()));
        }

        for (Stusent stusent : arr) {
            System.out.println(stusent.getName() + " " + stusent.getSubject().getSubjectName() + "/" + stusent.getSubject().getScore());
        }


    }
}
