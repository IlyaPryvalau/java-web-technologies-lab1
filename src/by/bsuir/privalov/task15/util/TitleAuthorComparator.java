package by.bsuir.privalov.task15.util;

import by.bsuir.privalov.task12.util.*;
import java.util.*;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        if (a.getTitle().compareTo(b.getTitle()) == 0){
            return a.getAuthor().compareTo(b.getAuthor());
        }
        return a.getTitle().compareTo(b.getTitle());
    }
}

