package Programmers;

public class Lv1_07 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

   static public int solution(int num) {
        long k = num;
        for(int i = 0; i < 500; i++){
            if(k == 1){
                return i;
            }
            if(k % 2 == 0){
                k /= 2;
            }else {
                k = (k * 3) + 1;
            }
        }
        return -1;
    }
}
