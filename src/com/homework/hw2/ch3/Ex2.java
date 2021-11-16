package com.homework.hw2.ch3;

public class Ex2 {
    interface Measurable {
        double getMeasure();
    }

    static class Employee implements Measurable {
        private final double salary;
        private final String name;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public double getMeasure() {
            return this.salary;
        }

        public String getName() {
            return name;
        }

        static double average(Measurable[] objects) {
            double out = 0.0;
            for (Measurable object : objects) {
                out += object.getMeasure();
            }
            return out;
        }

        static Measurable largest(Measurable[] objects) {
            Measurable out = new Employee("null", 0.0);
            for (int i = 0; i < objects.length - 1; i++) {
                if (objects[i].getMeasure() > objects[i + 1].getMeasure()) {
                    out = objects[i];
                }
            }
            return out;
        }
    }
}
