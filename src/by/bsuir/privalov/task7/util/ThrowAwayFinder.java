package by.bsuir.privalov.task7.util;

public class ThrowAwayFinder {

    public static int find(int arr[]){
        int maxSequenceCount = 0;

        for (int i = 0; i < arr.length - 1; i++){
            int j = i;
            int sequenceCount = 1;
            int temp = arr[j];
            for (j = i + 1; j < arr.length; j++){
                if (arr[j] > temp){
                    sequenceCount++;
                    temp = arr[j];
                }
            }
            if (sequenceCount > maxSequenceCount){
                maxSequenceCount = sequenceCount;
            }
        }
        return arr.length - maxSequenceCount;
    }
}
