package FastCampus.ch02_23;

import FastCampus.ch02_21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("책이름1", "저자"));
        library.add(new Book("책이름2", "저자"));
        library.add(new Book("책이름3", "저자"));
        library.add(new Book("책이름4", "저자"));
        library.add(new Book("책이름5", "저자"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
