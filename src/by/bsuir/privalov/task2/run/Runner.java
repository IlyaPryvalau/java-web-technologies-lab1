package by.bsuir.privalov.task2.run;
import by.bsuir.privalov.reader.*;
import by.bsuir.privalov.task2.util.*;

public class Runner {
    public static void main(String[] args) {
        int x, y;

        x = Reader.readInt();
        y = Reader.readInt();
        System.out.println(PointChecker.belongsToArea(x, y));
    }
}
