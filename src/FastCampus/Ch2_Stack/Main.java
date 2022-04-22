package FastCampus.Ch2_Stack;

public class Main {
    public static void main(String[] args) {

        StackTest<Integer> stackTest = new StackTest<>();

        stackTest.push(10);
        stackTest.push(20);
        stackTest.push(30);
        stackTest.push(40);
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
    }
}
