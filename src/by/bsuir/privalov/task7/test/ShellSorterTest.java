package by.bsuir.privalov.task7.test;

import by.bsuir.privalov.task7.util.ShellSorter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSorterTest {
    @Test
    public void sort() throws Exception {
        double[] array = new double[]{5, 4, 3, 2, 1};
        ShellSorter.sort(array);
        Assert.assertArrayEquals(new double[] {1.0, 2.0, 3.0, 4.0, 5.0}, array, Double.MIN_VALUE);
    }
}