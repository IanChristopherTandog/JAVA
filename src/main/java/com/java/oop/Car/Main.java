package com.java.oop.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");

        System.out.println(car);        // Toyota Corolla | Fuel: 100% | Running: false
        car.startCar();
        car.drive(50);
        System.out.println(car.getStatus()); // Toyota Corolla | Fuel: 95% | Running: true
        car.refuel(20);
        System.out.println(car);        // Toyota Corolla | Fuel: 100% | Running: true
    }
}
