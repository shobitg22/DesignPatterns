package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookAggregator implements Aggregator{
    List<Book> books = new ArrayList<>();

    public BookAggregator(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
