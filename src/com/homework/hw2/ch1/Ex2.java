package com.homework.hw2.ch1;

public class Ex2 {
    public static void convert(int angle) {
        // %
        System.out.println("Mod % 360: " + angle % 360);

        // Math.floor
        System.out.println("Math.floorMod(angle, 360): " + Math.floorMod(angle, 360));

        /*The difference in values between floorMod and the % operator is due
         to the difference between floorDiv that returns the integer less than
         or equal to the quotient and the / operator that returns the integer closest to zero.*/
    }
}
