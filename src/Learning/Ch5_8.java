package Learning;

public class Ch5_8 {
    public static void main(String[] args) {
        int sum = 0;
        float aver = 0f;

        int[] score={60,90,100,80,88};

        for (int i=0;i<score.length;i++){
            sum += score[i];
        }
        aver =  sum/ (float)score.length;
        System.out.println("총합 "+sum);
        System.out.println("평균 "+aver);
    }

}
