package by.bsuir.privalov.task13.run;

import by.bsuir.privalov.task13.util.*;
import by.bsuir.privalov.task12.util.*;

public class Runner {
    public static void main(String args[]){
        ProgrammerBook programmerBook1 = new ProgrammerBook("CLR via C#", "Richter", "English", 80, 666);
        Book book1 = new Book("CLR via C#", "Richter", 666);
        System.out.println(programmerBook1.equals(book1));
        System.out.println(programmerBook1.hashCode());
        System.out.println(programmerBook1.toString());
    }
}
