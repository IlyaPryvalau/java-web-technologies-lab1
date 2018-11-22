package by.bsuir.privalov.task15.run;

import java.util.*;
import by.bsuir.privalov.task12.util.*;
import by.bsuir.privalov.task15.util.*;

public class Runner {
    public static void main(String args[]){
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("234", "d", "e", 100));
        list.add(new Book("2324", "d", "e", 56));
        list.add(new Book("555", "d", "e", 44));
        list.add(new Book("3434", "d", "e", 33));
        list.add(new Book("3242", "d", "e", 26));
        for(Book b : list){
            System.out.println(b.toString());
        }
        list.sort(new AuthorTitlePriceComparator());
        for(Book b : list){
            System.out.println(b.toString());
        }
    }
}
