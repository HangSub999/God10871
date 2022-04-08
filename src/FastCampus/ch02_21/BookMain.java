package FastCampus.ch02_21;

public class BookMain {
    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("시리즈1", "김둘리");
        library[1] = new Book("시리즈2", "김둘리");
        library[2] = new Book("시리즈3", "김둘리");
        library[3] = new Book("시리즈4", "김둘리");
        library[4] = new Book("시리즈5", "김둘리");

        for (Book book : library) {
            book.showInfo();
        }
    }
}
