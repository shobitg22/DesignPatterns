package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookIterator implements Iterator{
    List<Book> books = new ArrayList<>();
    int counter = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return counter<books.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return books.get(counter++);
        }
        return null;
    }
}
