package SungJon_Test;

public class Arry {

    public int[] add(int[] a, int b) {
        int[] arrC = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            arrC[i] = a[i];
        }
        arrC[a.length] = b;
        return arrC;
    }

    public int[] remove(int[] arrN, int z) {
        int[] arrC = new int[arrN.length - 1];
        for (int i = 0; i < arrC.length; i++) {
            arrC[i] = arrN[i];
        }
        for (int arr : arrC) {
            System.out.print(arr + " ");
        }
        return arrC;
    }
}
