package Learning;

import java.lang.reflect.Array;
import java.util.Arrays;
//배옇의 활용 배열의 요소의 순서를 반복해서 바꾼다(숫자섞기,로또번호 생성)
public class Ch5_10 {
    public static void main(String[] args) {
        int[] numArr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0;i<100;i++){
            int n=(int) (Math.random()*10);
            int tmp= numArr[0];
            numArr[0]= numArr[n];
            numArr[n]= tmp;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
