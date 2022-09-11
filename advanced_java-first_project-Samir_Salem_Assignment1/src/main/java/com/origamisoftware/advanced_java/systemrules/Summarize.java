package com.origamisoftware.advanced_java.systemrules;
import java.util.Scanner;

/**
 * Simpple class to show how to write a test for system in / out
 */
public class Summarize {

    public static int sumOfNumbersFromSystemIn() {
        Scanner scanner = new Scanner(System.in);
        int firstSummand = scanner.nextInt();
        int secondSummand = scanner.nextInt();
        return firstSummand + secondSummand;
    }
}