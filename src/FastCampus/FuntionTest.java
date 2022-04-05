package FastCampus;

public class FuntionTest {

    public static int addNum(int num1, int num2) {
        int result;

        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;

        for (int j = 0; j < 100; j++) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        int add = calcSum();
        System.out.println(add);
    }
}
