package by.bsuir.privalov.task2.util;

public class PointChecker {
    public static boolean belongsToArea (int x, int y) {
        boolean belongsToArea;
        if (y > 0 && y <= 5) {
            belongsToArea = x >= -4 && x <= 4;
        } else if (y <= 0 && y >= -3) {
            belongsToArea = x >= -6 && x <= 6;
        } else
            belongsToArea = false;
        return belongsToArea;
    }
}