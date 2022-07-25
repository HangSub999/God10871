package FastCampus;

import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 1, 9};
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
