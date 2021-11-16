package com.homework.hw1;

import java.util.Objects;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{getX(), getY()};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(x=" + x + ",y=" + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.getX() - x, 2) + Math.pow(another.getY() - y, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.getX(), 2) +
                Math.pow(this.getY(), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return getX() == myPoint.getX() && getY() == myPoint.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
