public class ArrayInitValue {
    public static void main(String[] args) {
        ArrayInitValue array=new ArrayInitValue();
        array.referenceTypes();
    }
    public void referenceTypes(){
        String [] strings=new String[2];
        ArrayInitValue [] array=new ArrayInitValue[2];

        strings [0]="안녕하세요";
        array [0]=new ArrayInitValue();
        System.out.println("String "+strings[0]);
        System.out.println("String[1] "+strings[1]);
        System.out.println("array "+array[0]);
        System.out.println("array[1] "+array[1]);
    }
}

