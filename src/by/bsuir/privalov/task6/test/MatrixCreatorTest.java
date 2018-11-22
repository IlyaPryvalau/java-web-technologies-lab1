package by.bsuir.privalov.task6.test;

import by.bsuir.privalov.task6.util.MatrixCreator;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MatrixCreatorTest {
    @Test
    public void create() throws Exception {
        int[] array = new int[]{1, 2, 3};
        Assert.assertEquals(new int[][] {
                {1, 2, 3},
                {2, 3, 1},
                {3, 1, 2},
        }, MatrixCreator.create(array));
    }
}