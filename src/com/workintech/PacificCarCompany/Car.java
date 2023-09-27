package com.workintech.PacificCarCompany;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + " is braking";
    }
    @Override
    public String toString() {
        return "Car Name: " + this.name + ", Cylinders: " + this.cylinders;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders &&  name.equals(car.name);
    }
}
