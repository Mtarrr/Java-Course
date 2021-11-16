package com.homework.hw1;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        return this.real != 0.0;
    }

    public boolean isImaginary() {
        return this.imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real & this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.real == another.real & this.imag == another.imag;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        double output = 0;
        if (real > 0 & imag > 0) output = Math.atan(imag / real);
        else if (real > 0 & imag < 0) output = -Math.atan(imag / real);
        else if (real < 0 & imag > 0) output = Math.PI - Math.atan(imag / real);
        else if (real < 0 & imag < 0) output = -Math.PI + Math.atan(imag / real);
        else if (real == 0 & imag > 0) output = Math.PI / 2;
        else if (real == 0 & imag < 0) output = -Math.PI / 2;
        else if (real > 0) output = 0.0;
        else if (real < 0) output = Math.PI;
        return output;
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right){
        this.real *= right.getReal();
        this.imag *= right.getImag();
        return this;
    }

    public MyComplex devide(MyComplex right){
        this.real /= right.getReal();
        this.imag /= right.getImag();
        return this;
    }

    public MyComplex conjugate(){
        this.imag = -imag;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComplex)) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.getReal(), getReal()) == 0 && Double.compare(myComplex.getImag(), getImag()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isReal(), getImag());
    }
}
