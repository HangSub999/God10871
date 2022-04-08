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

        System.arraycopy(library, 0, copyLibrary, 0, 5);
        // 객체 배열 복사를 한 후에 library 를 변경하면 복사한 copyLibrary 도 같이 변경 된다.
        for (Book book : library) {
            book.showInfo();
        }
        System.out.println();

        for (Book book : copyLibrary) {
            book.showInfo();
        }
    }
}
