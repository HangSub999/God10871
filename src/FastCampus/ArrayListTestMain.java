package FastCampus;

import java.util.Arrays;

class Array<T> {
    private static final int 배열크기 = 50;
    int size;
    private T[] element;

    public Array() {
        this.size = 0;
        this.element = (T[]) new Object[배열크기];
    }

    public void add(T t) {
        this.element[size++] = t;
    }

    public void addll(int index, T t) {
        if (this.size == this.element.length) {
            this.element = Arrays.copyOf(this.element, this.size * 2);
        }
        for (int i = index; i < this.size; i++) {
            this.element[i + 1] = this.element[i];
        }
        this.element[index] = t;
        this.size++;
    }

    public void 출력() {
        System.out.println(Arrays.toString(element));
    }

}

public class ArrayListTestMain {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.addll(1, 99);
        array.출력();

    }
}
