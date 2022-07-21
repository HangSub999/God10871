package Learning;

interface MyFunction2 {
    void run();
}

class Ex14_1 {
    static void execute(MyFunction2 f) { // 매개변수 타입이 MyFunction2인 메서드
        f.run();
    }

    static MyFunction2 getMyFunction2() { // 반환 타입이 MyFunction2 인 메서
        return () -> System.out.println("f3.run()");
    }
}

public class Lambda2 {
    public static void main(String[] args) {
        // 람다식을 이용하여 MyFunction2 의 run()을 구현
        MyFunction2 f1 = () -> System.out.println("f1.run()");
        // 익명 클래스로 run()을 구현
        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunction2 f3 = Ex14_1.getMyFunction2();
        f1.run();
        f2.run();
        f3.run();
        Ex14_1.execute(f1);
        Ex14_1.execute(() -> System.out.println("f4.run()"));


    }
}
