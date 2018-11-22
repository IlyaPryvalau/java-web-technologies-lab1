package by.bsuir.privalov.task15.test;
import by.bsuir.privalov.task12.util.*;
import by.bsuir.privalov.task15.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;
import static org.junit.Assert.*;

public class BooksComparatorsTest {
    private ArrayList<Book> books;

    @Before
    public void InitializeBooks(){
        books = new ArrayList<Book>();
        books.add(new Book("234", "b", "d", 100));
        books.add(new Book("2324", "b", "n", 56));
        books.add(new Book("555", "a", "b", 44));
        books.add(new Book("3434", "a", "b", 33));
        books.add(new Book("3242", "a", "a", 26));
    }

    @Test
    public void BookSortUsingComparator(){
        ArrayList<Book> expected = new ArrayList<Book>();
        expected.add(new Book("3242", "a", "a", 26));
        expected.add(new Book("3434", "a", "b", 33));
        expected.add(new Book("555", "a", "b", 44));
        expected.add(new Book("234", "b", "d", 100));
        expected.add(new Book("2324", "b", "n", 56));
        books.sort(new AuthorTitlePriceComparator());
        Book[] arr1 = books.toArray(new Book[books.size()]);
        Book[] arr2 = expected.toArray(new Book[expected.size()]);
        assertArrayEquals(arr1, arr2);
    }
}
