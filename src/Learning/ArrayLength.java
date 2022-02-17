package Learning;

public class ArrayLength {
    public static void main(String[] args) {
        ArrayLength array=new ArrayLength();
        //array.printArrayLenght();
        array.printArray();
    }
    public void printArrayLenght(){
        int[] oneDim=new int[3];
        int[][] towDim=new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(towDim.length);

    }
    public void printArray(){
        int [][]towDim={{1,2,3},{4,5,6,}};
        System.out.println("towDim.length="+towDim.length);
        System.out.println("towDim[0]="+towDim[0].length);

        int towDimLength=towDim.length;
        for (int oneLoop=0;oneLoop<towDimLength;oneLoop++) {
            int towDimOneLength=towDim[oneLoop].length;
            for (int twoLoop=0;twoLoop<towDimOneLength;twoLoop++){
                System.out.println("towDim["+oneLoop+"]["+twoLoop+
                        "]="+towDim[oneLoop][twoLoop]);
            }
        }
    }
}
