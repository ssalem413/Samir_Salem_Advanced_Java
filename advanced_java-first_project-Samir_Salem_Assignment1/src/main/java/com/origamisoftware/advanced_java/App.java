package com.origamisoftware.advanced_java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Hello world!
 */
public class App {

    /**
     * Given an array of Strings, sort those string and return the arrya
     *
     * @param words the list of words to sort
     * @param order if true, sort Ascending ABC... if false, sort Descending ZXY...
     * @return array of words sorted either  Ascending or Descending as denoted by order flag
     */
    public Object sortList(String[] words, boolean order) {

        if(order == true)
        {
            for(int i = 0; i<words.length-1; i++) {
                for (int j = i+1; j<words.length; j++) {
                    if(words[i].compareTo(words[j])>0) {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }else{
            Arrays.sort(words, Comparator.reverseOrder());
        }
        return words;
    }

    /**
     * Given an array of Integers, add the contents and return their sum.
     *
     * @param numbers the list of ints to sum
     * @return return the sum of the numbers.
     * @throws java.security.InvalidParameterException is the list of numbers if empty or null.
     */

    public BigDecimal add(Integer[] numbers) {


        BigDecimal answer = new BigDecimal(0);

        try {
            for (Integer number : numbers) {
                answer = answer.add(new BigDecimal(number));

                }
        }catch (Exception e) {
            throw new java.security.InvalidParameterException("Cannot be empty or null");
        }
        return answer;
    }


    /**
     * Main entry point.
     * Prints contents of args to system.out. If args length is 0, prints  "Hello World!"
     *
     * @param args - if present prints args, otherwise prints: "Hello World!" to system.out
     */
    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("Hello World!");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

}