package by.bsuir.privalov.task1.run;
import by.bsuir.privalov.reader.*;
import by.bsuir.privalov.task1.util.*;

public class Runner {
    public static void main(String[] args){
        double x = Reader.readDouble();
        double y = Reader.readDouble();

        System.out.println(FormulaCalculator.calculate(x, y));
    }

}
