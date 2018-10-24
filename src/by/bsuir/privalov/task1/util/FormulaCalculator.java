package by.bsuir.privalov.task1.util;
import static java.lang.Math.*;

public class FormulaCalculator {
    public static double calculate(double x, double y){
        double result = (1 + pow(sin(x + y), 2)) / (2 + abs(x - 2 * x / (1 + pow(x, 2) * pow(y, 2)))) + x;
        return result;
    }
}
