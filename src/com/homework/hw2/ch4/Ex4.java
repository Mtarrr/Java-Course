package com.homework.hw2.ch4;

import java.util.Objects;

public class Ex4 {
    class Point {
        private final double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getX(), getY());
        }
    }

    abstract class Shape {
        protected Point point;

        public Shape(Point point) {
            this.point = point;
        }

        public void moveBy(double dx, double dy) {
            this.point = new Point(this.point.getX() + dx, this.point.getY() + dy);
        }

        public abstract Point getCenter();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Shape)) return false;
            Shape shape = (Shape) o;
            return point.equals(shape.point);
        }

        @Override
        public int hashCode() {
            return Objects.hash(point);
        }
    }

    class Circle extends Shape {
        private final double radius;

        public Circle(Point center, double radius) {
            super(center);
            this.radius = radius;
        }

        @Override
        public Point getCenter() {
            return this.point;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Circle)) return false;
            if (!super.equals(o)) return false;
            Circle circle = (Circle) o;
            return Double.compare(circle.radius, radius) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), radius);
        }
    }

    class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(Point topLeft, double width, double height) {
            super(topLeft);
            this.width = width;
            this.height = height;
        }

        @Override
        public Point getCenter() {
            double newX = (2 * this.point.getX() + this.width) / 2;
            double newY = (2 * this.point.getY() - this.height) / 2;
            return new Point(newX, newY);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Rectangle)) return false;
            if (!super.equals(o)) return false;
            Rectangle rectangle = (Rectangle) o;
            return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), width, height);
        }
    }

    class Line extends Shape {
        private Point from;
        private Point to;

        public Line(Point from, Point to) {
            super(null);
            this.from = from;
            this.to = to;
            double centerX = (this.from.getX() + this.to.getX()) / 2;
            double centerY = (this.from.getY() + this.to.getY()) / 2;
            this.point = new Point(centerX, centerY);
        }

        @Override
        public Point getCenter() {
            return this.point;
        }

        @Override
        public void moveBy(double dx, double dy) {
            super.moveBy(dx, dy);
            this.from = new Point(this.from.getX() + dx, this.from.getY() + dy);
            this.to = new Point(this.to.getX() + dx, this.to.getY() + dy);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Line)) return false;
            if (!super.equals(o)) return false;
            Line line = (Line) o;
            return from.equals(line.from) && to.equals(line.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), from, to);
        }
    }
}
