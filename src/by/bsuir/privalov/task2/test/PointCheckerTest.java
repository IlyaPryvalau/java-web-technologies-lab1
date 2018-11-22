package by.bsuir.privalov.task2.test;

import by.bsuir.privalov.task2.util.PointChecker;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PointCheckerTest {
    @Parameterized.Parameter
    public int x;
    @Parameterized.Parameter(1)
    public int y;
    @Parameterized.Parameter(2)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{
                {0, 0, true},
                {5, 0, true},
                {6, 1, false},
                {0, 6, false}
        };
        return Arrays.asList(data);
    }
    @Test
    public void belongToArea() {
        Assert.assertEquals(expected, PointChecker.belongsToArea(x, y));
    }
}