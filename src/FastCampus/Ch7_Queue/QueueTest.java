package FastCampus.Ch7_Queue;

import java.util.ArrayList;

public class QueueTest<T> {

    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T t) {
        queue.add(t);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

}
