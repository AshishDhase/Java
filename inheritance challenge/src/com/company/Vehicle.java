package com.company;

public class Vehicle {

    private int wheels;
    private String engine;
    private String color;


    public Vehicle(int wheels, String engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void move(int speed) {

    }
}
