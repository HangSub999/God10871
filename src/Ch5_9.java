public class Ch5_9 {
    public static void main(String[] args) {
        int[] score={10,100,60,88,99};

        int max=score[0];
        int min=score[0];
        for (int i=1;i< score.length;i++){
            if (score[i]>max){
                max=score[i];
            }else if (score[i]<min){
                min=score[i];
            }
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}
