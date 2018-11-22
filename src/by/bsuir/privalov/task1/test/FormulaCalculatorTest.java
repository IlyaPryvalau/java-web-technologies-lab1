package by.bsuir.privalov.task1.test;

import by.bsuir.privalov.task1.util.FormulaCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FormulaCalculatorTest {

    @Parameterized.Parameter
    public double x;
    @Parameterized.Parameter(1)
    public double y;
    @Parameterized.Parameter(2)
    public double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{
                {0, 0.1, 0.5049833555396895},
                {20, 15, 20.053789286570037},
                {-34, 0, -33.964446430868},
                {0, 0, 0.5}
        };
        return Arrays.asList(data);
    }
    @Test
    public void calculate() {
        Assert.assertEquals(expected, FormulaCalculator.calculate(x, y), Double.MIN_VALUE);
    }
}