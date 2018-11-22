package by.bsuir.privalov.task12.run;

import by.bsuir.privalov.task12.util.*;
import java.util.*;


public class Runner {
    public static void main(String args[]){
        Book book1 = new Book("12","Dead souls", "Gogol", 100);
        Book book2 = new Book("13","Deathworld", "Harrison", 100);
        Book book3 = (Book)book2.clone();
        Book book4 = new Book("15", "LOLkek", "loller", 334);
        Book[] arr = new Book[4];
        arr[0] = book4;
        arr[1] = book3;
        arr[2] = book2;
        arr[3] = book1;
        for(Book b : arr){
            System.out.println(b.toString());
        }
        Arrays.sort(arr);
        for(Book b : arr){
            System.out.println(b.toString());
        }
        System.out.println(book1.compareTo(book2));
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
