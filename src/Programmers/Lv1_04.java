package Programmers;

public class Lv1_04 {
    public static void main(String[] args) {

        System.out.println(solution("01054095929"));
    }
//핸드폰 번호가리기
    static public String solution(String phone_number) {
        String answer = "";
        String str = "*";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += str;
        }
        String len = phone_number.substring(phone_number.length() - 4);
        return answer + len;

    }
}
