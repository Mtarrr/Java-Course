package com.homework.hw2.ch3;

public class Ex1 {
    interface Measurable {
        double getMeasure();
    }

    static class Employee implements Measurable {
        private final double salary;

        public Employee(double salary) {
            this.salary = salary;
        }

        @Override
        public double getMeasure() {
            return this.salary;
        }

        static double average(Measurable[] objects) {
            double out = 0.0;
            for (Measurable object : objects) {
                out += object.getMeasure();
            }
            return out;
        }
    }
}
