package by.bsuir.privalov.task8.util;

import java.util.*;

public class InsertPlacesFinder {
    public static ArrayList<Integer> find(double[] a, double[] b){
       ArrayList<Integer> insertionPlaces = new ArrayList<Integer>();
       int j = 0;
       for (int i = 0; i < b.length; i++){
           while (a[i] >= b[j]){
               insertionPlaces.add(i);
               if (j < a.length - 1){
                   j++;
               } else {
                   break;
               }
           }
           if ((i == b.length - 1) && (j == a.length - 1)){
               insertionPlaces.add(i + 1);
           }
       }
       return insertionPlaces;
    }
}
