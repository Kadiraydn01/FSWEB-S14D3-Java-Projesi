package com.Car.RD.Company;

public class CarDeneme {
    public static void main(String[] args) {
        CarSkeleton gas = new GasPoweredCar("Toyota","Sağlam Arabadır",13.4,4);
        CarSkeleton elektrikli= new ElectricCar("Tesla", "Yeni Nesil Teknoloji",140,600);
        CarSkeleton hibrit = new HybridCar("Skoda" ,"Yolda Kalma Derdin Yok",10,300,4);

        CarSkeleton[] arabalar = {gas,elektrikli,hibrit};

        for (CarSkeleton araba : arabalar){
            araba.startEngine();
            araba.drive();
            System.out.println("Tip: " + araba.getClass().getSimpleName());
            System.out.println();
        }

    }
}
