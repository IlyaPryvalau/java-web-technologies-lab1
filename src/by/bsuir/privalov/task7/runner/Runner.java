package by.bsuir.privalov.task7.runner;

import by.bsuir.privalov.reader.Reader;
import by.bsuir.privalov.task7.util.ThrowAwayFinder;

public class Runner {
    public static void main(String[] args) {
        int n = Reader.readInt();
        int[] arr = new int[n];
        fill(arr);
        System.out.println(ThrowAwayFinder.find(arr));
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readInt();
        }
    }
}
