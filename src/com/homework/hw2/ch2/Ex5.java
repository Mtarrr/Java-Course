package com.homework.hw2.ch2;

public class Ex5 {
    public static class Point {
        private final double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point(double x) {
            this.x = 0;
            this.y = 0;
        }

        /*public double getX() {
            return x;
        }

        not needed because of toString

        public double getY() {
            return y;
        }*/

        public Point translate(double x, double y) {
            return new Point(this.x + x, this.y + y);
        }

        public Point scale(double scale) {
            return new Point(this.x * scale, this.y * scale);
        }

        @Override
        public String toString() {
            return "(" + this.x + ", " + this.y + ")";
        }
    }
}
