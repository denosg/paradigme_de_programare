package teme.lab6.pb2;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Surrounded by idiots","Thomas Erikson",112);
        Book book2 = new Book("The 48 Laws of Power","Robert Greene",666);
        Library library = new Library();
        library.add(book1);
        library.print();
        library.add(book2);
        library.print();
        library.delete(book1);
        library.print();
    }
}
