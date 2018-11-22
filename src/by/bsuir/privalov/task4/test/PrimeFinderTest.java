package by.bsuir.privalov.task4.test;

import by.bsuir.privalov.task4.util.PrimeFinder;
import org.junit.Test;
import java.util.*;
import org.junit.*;

import static org.junit.Assert.*;

public class PrimeFinderTest {
    @Test
    public void generateResult() throws Exception {
        ArrayList<Integer> expected = new ArrayList <Integer>(Arrays.asList(
                new Integer[]{ 0, 3, 4}
        ));
        Assert.assertEquals(expected, PrimeFinder.generateResult(new int[]{
                1, 12, 45, 17, 47
        }));
    }
}