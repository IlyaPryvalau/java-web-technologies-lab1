package by.bsuir.privalov.task4.run;
import by.bsuir.privalov.reader.*;
import by.bsuir.privalov.task4.util.*;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int n = Reader.readInt();
        int[] arr = new int[n];
        fill(arr);
        System.out.println(PrimeFinder.generateResult(arr).toString());
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readInt();
        }
    }
}