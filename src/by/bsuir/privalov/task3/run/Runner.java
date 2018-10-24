package by.bsuir.privalov.task3.run;
import by.bsuir.privalov.reader.*;
import by.bsuir.privalov.task3.util.*;
import java.util.*;

public class Runner {
    public static void main(String[] args){
        double a = Reader.readDouble();
        double b = Reader.readDouble();
        double h = Reader.readDouble();
        double x = a;
        ArrayList<Double> values = TanCalculator.calculate(a, b, h);

        for(double t : values){
            System.out.format("%.5f  %.5f%n", x, t);
            x += h;
        }
    }
}
