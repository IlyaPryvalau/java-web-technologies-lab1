package by.bsuir.privalov.reader;

import java.util.Scanner;

public class Reader {
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        return scanner.nextDouble();
    }
}