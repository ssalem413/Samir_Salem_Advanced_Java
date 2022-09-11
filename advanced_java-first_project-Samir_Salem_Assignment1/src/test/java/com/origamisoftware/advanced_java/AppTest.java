package com.origamisoftware.advanced_java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

/**
 * Unit test for simple App that uses system rules to capture and verify output
 */
public class AppTest {



    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void verifyMain() {

        // this line call App's main method which writes to system out
        App.main(new String[0]);

        assertEquals("Verify main output", "Hello World!\n", systemOutRule.getLog());
    }
    @Test
    public void verifySortList(){

        App sort = new App();
        String[] sortedArray = {"hello", "yes", "goodbye","welcome"};
        //this line call App's sortList method
        sort.sortList(sortedArray,true);
        String[] array2 = {"goodbye", "hello", "welcome", "yes"};

        assertArrayEquals(sortedArray, array2);
    }

    @Test
    public void verifySortListInReverse(){

        App sort = new App();
        String[] sortedArray = {"hello", "yes", "goodbye","welcome"};
        //this line call App's sortList method
        sort.sortList(sortedArray,false);
        String[] array2 = {"yes", "welcome", "hello", "goodbye"};

        assertArrayEquals(sortedArray, array2);
    }

    @Test
    public void verifyArrayElementSum(){

        //test to see if the method creates correct sum
        App elements = new App();
        BigDecimal expected = new BigDecimal(12);
        Integer[] array = {2, 4, 6};
        assertEquals(expected, elements.add(array));

    }

    @Test
    public void verifyExceptionAddMethod(){

        //tests if exception is thrown
        App elements = new App();
        BigDecimal expected = new BigDecimal(12);
        Integer[] array = {null};
        assertThrows(RuntimeException.class, () -> elements.add(array));

        }





}
