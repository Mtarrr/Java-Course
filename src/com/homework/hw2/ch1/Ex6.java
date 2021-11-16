package com.homework.hw2.ch1;

import java.math.BigInteger;

public class Ex6 {
    public static BigInteger factorial(int number) {
        BigInteger out = BigInteger.ONE;
        for (int i = 2; i <= number; i++)
            out = out.multiply(BigInteger.valueOf(i));
        return out;

    }
}
