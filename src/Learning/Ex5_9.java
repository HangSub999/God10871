package Learning;

public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        //과목별 총점
        int korTotal = 0, engTotal = 0, matTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균 ");
        System.out.println("=============================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0; //개인별 총점
            float avg = 0.0f; //개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            matTotal += score[i][2];

            System.out.printf("%3d", i + 1);
        }
    }
}
