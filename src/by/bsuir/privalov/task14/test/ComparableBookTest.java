package by.bsuir.privalov.task14.test;
import by.bsuir.privalov.task12.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;
import static org.junit.Assert.*;

public class ComparableBookTest {
    private Book[] books;

    @Before
    public void InitializeBooks(){
        books = new Book[]{
                new Book("20","Dead souls", "Gogol", 100),
                new Book("10","Deathworld", "Harrison", 100),
                new Book("30","Deathworld", "Harrison", 100),
                new Book("15", "LOLkek", "loller", 334)
        };
    }

    @Test
    public void BookSort(){
        Book[] expected = new Book[]{
                new Book("10","Deathworld", "Harrison", 100),
                new Book("15", "LOLkek", "loller", 334),
                new Book("20","Dead souls", "Gogol", 100),
                new Book("30","Deathworld", "Harrison", 100)
        };
        Arrays.sort(books);
        assertArrayEquals(expected, books);
    }
}