package com.homework.hw1;

import java.util.Arrays;
import java.util.Objects;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
        double ab = v1.distance(v2);
        double bc = v2.distance(v3);
        double ca = v3.distance(v1);
        if ((ab == 0 | bc == 0 | ca == 0) | (x1 == x2 & x2 == x3) | (y1 == y2 & y2 == y3))
            System.out.println("Nonexistent triangle");
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        double ab = v1.distance(v2);
        double bc = v2.distance(v3);
        double ca = v3.distance(v1);
        if ((ab == 0 | bc == 0 | ca == 0) | (v1.getX() == v2.getX() & v2.getX() == v3.getX()) | (v1.getY() == v2.getY() & v2.getY() == v3.getY()))
            System.out.println("Nonexistent triangle");
    }

    public String toString() {
        return "MyTriangle[v1=" + Arrays.toString(v1.getXY()) + ",v2=" + Arrays.toString(v2.getXY()) + ",v3=" + Arrays.toString(v3.getXY()) + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        Types output;
        double ab = v1.distance(v2);
        double bc = v2.distance(v3);
        double ca = v3.distance(v1);
        if (compare(ab, bc) & compare(bc, ca)) output = Types.EQUILATERAL;
        else if (compare(ab, bc) | compare(bc, ca) | compare(ca, ab)) output = Types.ISOSCELES;
        else output = Types.SCALENE;
        return String.valueOf(output);
    }

    public boolean compare(double a, double b) {
        boolean output = false;
        final double threshold = 0.0001;
        if (Math.abs(a - b) < threshold)
            output = true;
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) return false;
        MyTriangle triangle = (MyTriangle) o;
        return v1.equals(triangle.v1) && v2.equals(triangle.v2) && v3.equals(triangle.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}
