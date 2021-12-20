public class ArrayLotto {
    public static void main(String[] args) {
        ArrayLotto array = new ArrayLotto();
        array.init();
    }
    public void init(){
        int [] lottoNumbers = new int[7];
        lottoNumbers [0] = 10;
        lottoNumbers [1] = 1;
        lottoNumbers [2] = 9;
        lottoNumbers [3] = 16;
        lottoNumbers [4] = 12;
        lottoNumbers [5] = 22;
        lottoNumbers [6] = 11;
        System.out.println(lottoNumbers[0]);
    }

}
