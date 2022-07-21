package Learning;

public class Lambda {
    public static void main(String[] args) {
      /*  MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };*/
        MyFunction f = (a, b) -> a > b ? a : b;
        int value = f.max(3, 5);
        System.out.println(value);
    }
}

@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}
