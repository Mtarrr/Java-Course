package com.homework.hw2.ch1;

public class Ex3 {
    public static void largest(int first, int second, int third) {
        //conditional operator
        System.out.printf("Largest using ?: %d\n", first >= second ? (first >= third ? first : third) : (second >= third ? second : third));

        //Math.max
        System.out.println("Largest using Math.max: " + Math.max(first, Math.max(second, third)));
    }

}
