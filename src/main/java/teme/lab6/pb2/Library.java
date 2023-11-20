package teme.lab6.pb2;

import java.util.ArrayList;
import java.util.List;

class Library{
    List<Book> books= new ArrayList<>();
    public void add(Book book){
        books.add(book);
        System.out.println("The book "+book.getTitle()+" has been added");
    }
    public void delete(Book book){
        books.remove(book);
        System.out.println("The book "+book.getTitle()+" has been deleted");
    }
    public void print(){
        for(Book book : books){
            System.out.println(book.getISBN()+" = "+book.getTitle()+" = "+book.getAuthor());
        }
    }
}
