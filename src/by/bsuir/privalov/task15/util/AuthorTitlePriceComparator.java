package by.bsuir.privalov.task15.util;

import by.bsuir.privalov.task12.util.*;
import java.util.*;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        if (a.getAuthor().compareTo(b.getAuthor()) == 0) {
            if (a.getTitle().compareTo(b.getTitle()) == 0) {
                return Integer.compare(a.getPrice(), b.getPrice());
            }
            return a.getTitle().compareTo(b.getTitle());
        }
        return a.getAuthor().compareTo(b.getAuthor());
    }
}