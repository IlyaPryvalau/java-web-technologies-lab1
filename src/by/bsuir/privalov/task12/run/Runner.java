package by.bsuir.privalov.task12.run;

import by.bsuir.privalov.task12.util.*;

public class Runner {
    public static void main(String args[]){
        Book book1 = new Book("Dead souls", "Gogol", 100);
        Book book2 = new Book("Deathworld", "Harrison", 100);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}
