package FastCampus;

import java.util.Arrays;

public class SortTest2 {
    public static void main(String[] args) {
        int[] rotto = {7, 44, 16, 32, 1, 22};
        System.out.println("정렬전 로또 번호 \n" + Arrays.toString(rotto));

        int temp = 0;
        for (int i = 0; i < rotto.length - 1; i++) {
            for (int j = (i * 1) + 1; j < rotto.length; j++) {
                if (rotto[i] > rotto[j]) {
                    temp = rotto[i];
                    rotto[i] = rotto[j];
                    rotto[j] = temp;
                }
            }
        }

        System.out.println("정렬후 로또 번호\n" + Arrays.toString(rotto));
    }
}
