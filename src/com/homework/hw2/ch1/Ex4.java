package com.homework.hw2.ch1;

public class Ex4 {
    public static void doubleVar() {
        //using Double
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);

        // using Math
        System.out.println("Smallest positive double: " + Math.nextUp(0.0));
        System.out.println("Largest positive double: " + Math.nextDown(Double.POSITIVE_INFINITY));
    }
}
