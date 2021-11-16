package com.homework.hw1;

import java.util.Arrays;
import java.util.Collections;

public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double... coeffs) {
        double[] outArr = new double[coeffs.length];
        System.arraycopy(coeffs, 0, outArr, 0, coeffs.length);
        this.coeffs = outArr;
    }

    public int getDegree() {
        int degree = 0;
        for (int i = 0; i < coeffs.length; i++)
            if (coeffs[i] != 0) degree = i;
        return degree;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Collections.reverse(Arrays.asList(coeffs));
        int count = coeffs.length - 1;
        stringBuilder.append(coeffs[0]).append("x^").append(count);
        count--;
        for (int i = 1; i < coeffs.length; i++) {
            if (coeffs[i] >= 0) stringBuilder.append(" +").append(coeffs[i]).append("x^").append(count);
            else stringBuilder.append(" ").append(coeffs[i]).append("x^").append(count);
            count--;
        }
        stringBuilder.replace(stringBuilder.length() - 3, stringBuilder.length(), "");
        return stringBuilder.toString();
    }

    public double evaluate(double x) {
        double output = 0;
        for (int i = this.getDegree(); i >= 0; i--)
            output = coeffs[i] + (x * output);
        return output;
    }

    public MyPolinomial add(MyPolinomial right) {
        int length = Math.max(this.coeffs.length, right.coeffs.length);
        double[] out = new double[length];

        if (this.coeffs.length > right.coeffs.length) {
            int start = this.coeffs.length - right.coeffs.length;
            for (int i = 0; i <= this.getDegree(); i++) out[i] += this.coeffs[i];
            for (int i = 0; i <= right.getDegree(); i++) out[i + start] += right.coeffs[i];
        } else {
            int start = right.coeffs.length - this.coeffs.length;
            for (int i = 0; i <= right.getDegree(); i++) out[i] += right.coeffs[i];
            for (int i = 0; i <= this.getDegree(); i++) out[i + start] += this.coeffs[i];
        }

        return new MyPolinomial(out);
    }

    public MyPolinomial multiply(MyPolinomial right) {
        int length = Math.max(this.coeffs.length, right.coeffs.length);
        double[] out = new double[length];
        Arrays.fill(out, 1);
        if (this.coeffs.length > right.coeffs.length) {
            int start = this.coeffs.length - right.coeffs.length;
            for (int i = 0; i <= this.getDegree(); i++) out[i] *= this.coeffs[i];
            for (int i = 0; i <= right.getDegree(); i++) out[i + start] *= right.coeffs[i];
        } else {
            int start = right.coeffs.length - this.coeffs.length;
            for (int i = 0; i <= right.getDegree(); i++) out[i] *= right.coeffs[i];
            for (int i = 0; i <= this.getDegree(); i++) out[i + start] *= this.coeffs[i];
        }

        return new MyPolinomial(out);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolinomial)) return false;
        MyPolinomial that = (MyPolinomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
