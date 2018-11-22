package by.bsuir.privalov.task8.test;

import by.bsuir.privalov.task8.util.InsertPlacesFinder;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

import static org.junit.Assert.*;

public class InsertPlacesFinderTest {
    @Test
    public void find() throws Exception {
        ArrayList<Integer> list = InsertPlacesFinder.find(new double[]{ 1, 3, 5, 7},
                new double[] {2, 4, 6, 8});
        Integer[] arr = list.toArray(new Integer[list.size()]);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4}, arr);
    }
}