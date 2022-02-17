package Learning;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array=new ArrayPrint();
        array.printString();

    }
    public void printString(){
        System.out.println("String ="+new String[0]);
        System.out.println("array ="+new ArrayPrint[0]);
    }
    public void printPrimitiveArray(){
        System.out.println("byteArray="+ new byte[1]);
        System.out.println("shortArray="+ new short[1]);
        System.out.println("intArray="+ new int [1]);
        System.out.println("longArray="+ new long [1]);
        System.out.println("floatAttay"+ new float[1]);
        System.out.println("doubleArray"+ new double[1]);
        System.out.println("chatArray"+ new char[1]);
        System.out.println("booleanArray"+ new boolean[1]);
    }
}
