package by.bsuir.privalov.task5.test;

import by.bsuir.privalov.task5.util.ThrowAwayFinder;
import org.junit.Test;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class ThrowAwayFinderTest {
    @Test
    public void find() throws Exception {
        int[] array = new int[] {1, 11, 2, 22, 23};
        int expected = 1;
        Assert.assertEquals(expected, ThrowAwayFinder.find(array));
    }
}