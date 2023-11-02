package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("book1","author1",100));
        books.add(new Book("book2","author2",200));
        books.add(new Book("book3","author3",300));

        BookAggregator bookAggregator = new BookAggregator(books);
        Iterator iterator = bookAggregator.createIterator();

        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
