package by.bsuir.privalov.task15.util;

import by.bsuir.privalov.task12.util.*;
        import java.util.*;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}
