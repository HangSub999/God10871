package FastCampus;

class A {
    int i = 10;
}

class B extends A {
    int j = 100;
    int a = 20;
}

class C extends B {
    int k = 1000;
}

public class SuperTest {
    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.i);

        B b = new C();
        System.out.println(b.i);
    }
}
