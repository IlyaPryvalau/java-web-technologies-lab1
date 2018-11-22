package by.bsuir.privalov.task3.test;

import by.bsuir.privalov.task3.util.TanCalculator;
import org.junit.Test;
import java.util.*;
import org.junit.*;

import static org.junit.Assert.*;

public class TanCalculatorTest {
    @Test
    public void calculate(){
        Double[] expected = new Double[]{ 1.5574077246549023, 2.5721516221263188,
                        5.797883715482887, -34.23253273555758,
                        -4.286261674628067, -2.18503986326152};
        ArrayList<Double> list = TanCalculator.calculate(1, 2, 0.2);
        Double[] actual = list.toArray(new Double[list.size()]);
        assertArrayEquals(expected, actual);
    }
}