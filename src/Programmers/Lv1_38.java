package Programmers;

public class Lv1_38 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }

    //완주하지 못한 선수
    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    participant[i] = "";
                    completion[j] = "";
                }
            }
        }
        for (String str : participant) {
            if (!str.equals("")) {
                answer = str;
            }
        }
        return answer;
    }
}
