package by.bsuir.privalov.task13.util;

import by.bsuir.privalov.task12.util.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String isbn, String title, String author, String language, int level, int price){
        super(isbn, title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof ProgrammerBook)){
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook)o;
        return ((Book)programmerBook).equals(programmerBook) && programmerBook.language.equals(language) &&
                programmerBook.level == level;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString(){
        return String.format("%s in %s %dlvl", super.toString(), language, level);
    }
}
