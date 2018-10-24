package by.bsuir.privalov.task4.util;
import java.util.*;

public class PrimeFinder {
    public static ArrayList<Integer> generateResult(int[] array) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (PrimeFinder.isPrime(array[i])){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int num) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
