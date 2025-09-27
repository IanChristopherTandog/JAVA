package com.java.oop.Car;

public class Car {

    private String brand;
    private String model;
    private int fuel = 100;
    private boolean isRunning = false;

    public Car(String carBrand, String carModel){
        brand = carBrand;
        model = carModel;
    }
    public void startCar(){
        if (fuel > 0){
            isRunning = true;
            System.out.println("The car started!");
        }
        else {
            isRunning = false;
            System.out.println("No fuel! Cannot start the car.");
        }
    }
    public void drive(int distance){
        fuel -= distance/10;
        if(fuel <= 0){
            isRunning = false;
            System.out.println("The car ran out of fuel, you can't start the car.");
        }
        else {
            isRunning = true;
        }
    }
    public void refuel(int amount){
        fuel += amount;
        if (fuel >= 100){
            fuel = 100;
        }
        else {
            return;
        }
    }
    public String getStatus(){
        return "Brand " + brand + " Model: " + model + " | Fuel: " + fuel + "%" + " | Running: " + isRunning;
    }
    public String toString(){
        return "The car with the brand " + brand + " and model " + model + " has a fuel amounting to: " + fuel + "%" + " is it is currenly " + isRunning;
    }
}
