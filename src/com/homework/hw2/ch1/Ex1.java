package com.homework.hw2.ch1;

public class Ex1 {
    public static void convert(int number) {
        // binary
        System.out.printf("Binary: %s\n", Integer.toBinaryString(number));

        // octal
        System.out.printf("Octal: %o\n", number);

        // hexadecimal
        System.out.printf("Hexadecimal: %x\n", number);

        // hexadecimal floating point
        System.out.printf("hexadecimal floating point: %a\n", 1.0 / number);
    }
}
