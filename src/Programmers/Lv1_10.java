package Programmers;

public class Lv1_10 {
    //정수제곱근 판별
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);

        if(answer*answer != n){
            return -1;
        }
        return (1+answer)*(answer+1);
    }
}
