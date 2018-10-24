package by.bsuir.privalov.task6.runner;

import by.bsuir.privalov.reader.Reader;
import by.bsuir.privalov.task6.util.*;

public class Runner {
    public static void main(String[] args) {
        int n = Reader.readInt();
        int[] arr = new int[n];
        fill(arr);
        int[][] matrix = MatrixCreator.create(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.format("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Reader.readInt();
        }
    }
}
