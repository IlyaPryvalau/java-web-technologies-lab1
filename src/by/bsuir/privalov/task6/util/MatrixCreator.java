package by.bsuir.privalov.task6.util;

public class MatrixCreator {
    public static int[][] create(int[] arr){
        int i;
        int j;
        int[][] matrix = new int[arr.length][arr.length];

        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr.length; j++){
                matrix[i][j] = arr[(j + i) % arr.length];
            }
        }
        return matrix;
    }
}
