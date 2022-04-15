package Learning;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_Test {
    public static void main(String[] args) {

        Stack st = new Stack();
        Queue queue = new LinkedList();

        st.push(1);
        st.push(2);
        st.push(3);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Stack-------");

        while (!st.empty()) {
            System.out.println(st.pop());

        }

        System.out.println("Queue---------");

        while (!queue.isEmpty()) {

            System.out.println(queue.poll());
        }
    }
}
