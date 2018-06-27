package com.company;

public class Car extends Vehicle{

    private int wheels;
    private String engine;
    private String seats;

    public Car(int wheels, String engine, String color, String seats) {
        super(1, "yes",  color);
        this.wheels = wheels;
        this.engine = engine;
        this.seats = seats;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    public String getSeats() {
        return seats;
    }

    public void steer() {
        System.out.println(moveLeft("left"));
        System.out.println(moveRight("right"));
    }

    private String moveRight(String right) {
        return "vehicle is moving towards right";
    }

    private String moveLeft(String left) {
        return "vehicle is moving towards left";
    }

    @Override
    public void move(int speed) {
        System.out.println("Vehicle is running at speed: "+speed);
        steer();
    }
}
