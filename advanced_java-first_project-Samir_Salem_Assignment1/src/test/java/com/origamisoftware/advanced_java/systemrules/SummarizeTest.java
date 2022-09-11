package com.origamisoftware.advanced_java.systemrules;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import com.origamisoftware.advanced_java.systemrules.Summarize;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

/**
 * How to test System.in
 *
 * The TextFromStandardInputStream rule helps you to create tests for classes which read from System.in.
 * You specify the lines provided by System.in, by calling provideLines(String...).
 * The example's class under test reads two numbers from System.in and calculates the sum of these numbers.
 *
 * from: https://stefanbirkner.github.io/system-rules/
 *
 */
public class SummarizeTest {

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();

    @Test
    public void summarizesTwoNumbers() {
        systemInMock.provideLines("1", "2");
        assertEquals(3, Summarize.sumOfNumbersFromSystemIn());
    }
}