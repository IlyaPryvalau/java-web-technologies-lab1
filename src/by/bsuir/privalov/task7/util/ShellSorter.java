package by.bsuir.privalov.task7.util;

public class ShellSorter {
    public static void sort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i < 1) {
                    i--;
                } else {
                    i -= 2;
                }
            }
        }
    }
}
