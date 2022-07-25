package FastCampus;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {
        //Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        //Function<String, Integer> f = 클래스이름 :: 메서드이름; 메서드 참조
        Function<String, Integer> f = Integer::parseInt;

        // 입력 X 출력 O
        //Supplier<MyClass> s = () -> new MyClass();
        //MyClass mc = s.get();
        //Supplier<MyClass> s = MyClass::new; // 메서드 참조
        //Function<Integer,MyClass> s = (i) -> new MyClass(i);
        Function<Integer, MyClass> s = MyClass::new; //메서드 참조
        MyClass mc = s.apply(100);
        System.out.println(mc.iv);
        System.out.println(s.apply(200).iv);

//        Function<Integer, int[]> m = (i) -> new int[i];
        Function<Integer, int[]> m = int[]::new; // 메서드 참조

    }
}

class MyClass {
    int iv;

    public MyClass(int iv) {
        this.iv = iv;
    }
}
