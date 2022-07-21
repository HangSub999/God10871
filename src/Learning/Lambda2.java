package Learning;

interface MyFunction2 {
    void run();
}

public class Lambda2 {

    static void execute(MyFunction2 f) { // 매개변수 타입이 MyFunction2인 메서드
        f.run();
    }

    static MyFunction2 getMyFunction2() { // 반환 타입이 MyFunction2 인 메서
        return () -> System.out.println("f3.run()");
    }

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
        MyFunction2 f3 = getMyFunction2();
        f1.run();
        f2.run();
        f3.run();
        execute(f1);
        execute(() -> System.out.println("f4.run()"));
    }
}
