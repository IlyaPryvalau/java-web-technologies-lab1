package by.bsuir.privalov.task3.util;
import java.util.*;
import static java.lang.Math.*;

public class TanCalculator {
    public static ArrayList<Double> calculate(double a, double b, double h){
        ArrayList<Double> valueList = new ArrayList();
        int valueCount = (int)((b - a) / h);
        double x = a;

        for (double i = 0; i <= valueCount; i++){
            valueList.add(tan(x));
            x += h;
        }
        return valueList;
    }
}
