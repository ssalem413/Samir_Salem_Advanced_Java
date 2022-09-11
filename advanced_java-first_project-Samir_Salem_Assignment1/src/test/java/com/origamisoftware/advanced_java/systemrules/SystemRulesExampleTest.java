package com.origamisoftware.advanced_java.systemrules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;
import org.junit.contrib.java.lang.system.SystemErrRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Shows how to use various System Rules features.
 * Code from here: https://stefanbirkner.github.io/system-rules/
 *
 */
public class SystemRulesExampleTest {

    /* The ClearSystemProperties rule deletes the property before the test and restores the original
     value of the property when the test is finished.
     */

    @Rule
    public final ClearSystemProperties myPropertyIsCleared = new ClearSystemProperties("MyProperty");

    @Test
    public void overrideProperty() {
        assertNull(System.getProperty("MyProperty"));
    }

    /* The SystemErrRule and the SystemOutRule help you to create tests for classes that write to System.err
     or System.out. They can record everything written to System.err or System.out.
     The text is available by calling getLog().
     */
    @Rule
    public final SystemErrRule systemErrRule = new SystemErrRule().enableLog();

    @Test
    public void writesTextToSystemErr() {
        System.err.print("hello world");
        assertEquals("hello world", systemErrRule.getLog());
    }

}


