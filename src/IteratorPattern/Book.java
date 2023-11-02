package IteratorPattern;

public class Book {

    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            '}';
    }
}
