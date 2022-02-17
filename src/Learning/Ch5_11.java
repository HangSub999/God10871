package Learning;

import java.util.Arrays;

public class Ch5_11 {        //랜덤 가위,바위,보 만들기
    public static void main(String[] args) {
        String [] strArr = {"가위","바위","보"};
        int tmp=0;

        for (int i=0;i<10;i++){
            tmp= (int) (Math.random()*3);
            System.out.println(strArr[tmp]);
        }

    }
}
