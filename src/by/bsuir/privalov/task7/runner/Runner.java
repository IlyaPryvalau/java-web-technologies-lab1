package by.bsuir.privalov.task7.runner;

import by.bsuir.privalov.reader.Reader;
import by.bsuir.privalov.task7.util.*;

public class Runner {
    public static void main(String[] args) {
        int n = Reader.readInt();
        double[] arr = new double[n];
        fill(arr);
        ShellSorter.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void fill(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readDouble();
        }
    }
}
