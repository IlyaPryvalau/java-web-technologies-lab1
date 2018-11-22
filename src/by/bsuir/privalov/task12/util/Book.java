package by.bsuir.privalov.task12.util;

import java.util.Objects;

import static java.lang.Integer.*;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String isbn, String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice(){
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static int getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
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
        return String.format("%s by %s, %d", title, author, price);
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public int compareTo(Book book){
        return parseInt(this.isbn) - parseInt(book.isbn);
    }
}
