package com.homework.hw2.ch2;

public class Ex9 {
    public static class Car {
        private final double lpkm; // litres per km
        private double litres;
        private double distance = 0.0;

        public Car(double lpkm, double litres) {
            this.lpkm = lpkm;
            this.litres = litres;
        }

        public Car(double lpkm) {
            this(lpkm, 10);
        } // new car with own lpkm, 10litres added

        public void drive(double lpkm) {
            double litresNeeded = lpkm / this.lpkm;
            if (litresNeeded > this.litres) {
                String message = "Not enough fuel. To overcome this distance you need: "
                        + litresNeeded + ",but you have only: " + this.litres;
                throw new RuntimeException(message);
            }
            this.distance += lpkm;
            this.litres -= litresNeeded;
        }

        public void refueling(double litres) {
            this.litres += litres;
        }

        public double getFuelLevel() {
            return this.litres;
        }

        public double getDistance() {
            return distance;
        }
    }
}
