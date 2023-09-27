package com.Car.RD.Company;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Starting the engine of " + name);
    }
    public void drive(){
        System.out.println("Driving " + name);
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Running the engine of " + name);
    }
}
