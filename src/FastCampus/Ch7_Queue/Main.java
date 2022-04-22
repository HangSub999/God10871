package FastCampus.Ch7_Queue;

public class Main {
    public static void main(String[] args) {
        QueueTest<Integer> mq = new QueueTest<>();

        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
