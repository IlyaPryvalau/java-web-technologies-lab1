package by.bsuir.privalov.task8.run;

import by.bsuir.privalov.reader.Reader;
import by.bsuir.privalov.task8.util.*;

public class Runner {
    public static void main(String[] args) {
        int n = Reader.readInt();
        double[] a = new double[n];
        double[] b = new double[n];

        System.out.println("Type the elements of a.");
        fill(a);
        System.out.println("Type the elements of b.");
        fill(b);
        Integer[] insertionPlaces = new Integer[InsertPlacesFinder.find(a, b).size()];
        insertionPlaces = InsertPlacesFinder.find(a, b).toArray(insertionPlaces);

        for (int i = 0; i < n; i++){
            System.out.format("b%d  %5d%n", i, insertionPlaces[i]);
        }
    }

    public static void fill(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readDouble();
        }
    }
}
