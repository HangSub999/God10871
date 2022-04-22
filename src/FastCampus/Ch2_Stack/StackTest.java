package FastCampus.Ch2_Stack;


import java.util.ArrayList;

public class StackTest<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T t) {
        this.stack.add(t);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.remove(stack.size() - 1);
    }


}
