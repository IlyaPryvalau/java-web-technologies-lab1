package by.bsuir.privalov.task12.util;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Book)){
            return false;
        }
        Book book = (Book)o;
        return book.title.equals(title) && book.author.equals(author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString(){
        return String.format("%s by %s", title, author);
    }
}
