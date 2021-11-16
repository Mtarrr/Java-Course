package com.homework.hw2.ch2;

public class Main {
    public static void main(String[] args) {
        Ex5.Point p = new Ex5.Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);


        Ex9.Car car = new Ex9.Car(35.0); // can drive 350km
        Ex9.Car car2 = new Ex9.Car(35.0); // can drive 350km
        car.drive(100.0); //ok
        car2.refueling(1);
        car2.drive(351.0); // not ok without refueling -> exception
        System.out.println("Fuel level is " + car.getFuelLevel());
        System.out.println("Current position is " + car.getDistance());
        System.out.println("Fuel level is " + car2.getFuelLevel());
        System.out.println("Current position is " + car2.getDistance());
    }
}
