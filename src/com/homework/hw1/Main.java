package com.homework.hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println();


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle);
        System.out.println();


        Employee employee = new Employee(1, "Ivan", "Ivanov", 50000);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getId());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(employee.raiseSalary(15));
        System.out.println(employee);
        System.out.println();


        Book.Author author1 = new Book.Author("Ivanov", "ivanov@gmail.com", 'm');
        Book.Author author2 = new Book.Author("Petrova", "petrova@gmail.com", 'f');
        Book.Author[] authors = {author1, author2};
        Book book = new Book("Fairy tales", authors, 750.0, 12);
        System.out.println(Arrays.toString(book.getAuthors()));
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        System.out.println(book);
        System.out.println(book.getAuthorNames());
        System.out.println();


        MyPoint myPoint1 = new MyPoint();
        System.out.println(myPoint1.getX());
        System.out.println(myPoint1.getY());
        System.out.println(myPoint1.distance());
        System.out.println(myPoint1.distance(4, 4));
        MyPoint myPoint2 = new MyPoint(5, 5);
        System.out.println(myPoint1.distance(myPoint2));
        System.out.println(myPoint2);
        System.out.println(Arrays.toString(myPoint2.getXY()));
        System.out.println();

        MyTriangle scalene = new MyTriangle(0, 0, 5, 0, 4, 2);
        MyPoint v1 = new MyPoint(0, 3);
        MyPoint v2 = new MyPoint(-2, -3);
        MyPoint v3 = new MyPoint(-6, 1);
        MyTriangle isosceles = new MyTriangle(v1, v2, v3);
        MyTriangle equilateral = new MyTriangle(0, 0, 0, 0, 0, 0);
        System.out.println(scalene.getType());
        System.out.println(scalene.getPerimeter());
        System.out.println(scalene);
        System.out.println(isosceles.getType());
        System.out.println(isosceles.getPerimeter());
        System.out.println(isosceles);
        System.out.println(equilateral.getType());
        System.out.println(equilateral.getPerimeter());
        System.out.println(equilateral);
        System.out.println();

        MyPolinomial myPolinomial = new MyPolinomial(-13, 28, -34, 543, 2);
        System.out.println(myPolinomial);
        System.out.println("evaluate " + myPolinomial.evaluate(2));
        System.out.println("getDegree " + myPolinomial.getDegree());
        System.out.println("add with bigger " + myPolinomial.add(new MyPolinomial(2, 3, 4, 5, 6, 7, -8)));
        System.out.println("add with smaller" + myPolinomial.add(new MyPolinomial(6, 7, -8)));
        System.out.println("multiply with bigger " + myPolinomial.multiply(new MyPolinomial(2, 3, 4, 5, 6, 7)));
        System.out.println("multiply with smaller " + myPolinomial.multiply(new MyPolinomial(2, 3, 4)));
        System.out.println();


        Ball ball = new Ball(10.0f, 10.0f, 5, 10, 0);
        ball.move();
        Container container = new Container(0, 0, 50, 50);
        Container container1 = new Container(0, 0, 20, 20);
        System.out.println(container.collides(ball)); //true
        System.out.println(container1.collides(ball)); //false
    }
}
