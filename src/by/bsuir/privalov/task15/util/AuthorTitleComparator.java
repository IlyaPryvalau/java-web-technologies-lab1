package by.bsuir.privalov.task15.util;

import by.bsuir.privalov.task12.util.*;
import java.util.*;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        if (a.getAuthor().compareTo(b.getAuthor()) == 0){
            return a.getTitle().compareTo(b.getTitle());
        }
        return a.getAuthor().compareTo(b.getAuthor());
    }
}
