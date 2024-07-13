package utils;

import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner input() {
        return scanner;
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void println() {
        System.out.println();
    };
}
