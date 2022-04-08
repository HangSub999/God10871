package FastCampus.ch02_21;

public class BookCopyTestMain {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("바꾼다", "같이복사?");
        library[1] = new Book("시리즈2", "김둘리");
        library[2] = new Book("시리즈3", "김둘리");
        library[3] = new Book("시리즈4", "김둘리");
        library[4] = new Book("시리즈5", "김둘리");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        for (Book book : library) {
            book.showInfo();
        }
        System.out.println();

        for (Book book : copyLibrary) {
            book.showInfo();
        }
    }
}
