package com.company;

public class BMWCar extends Car{
    private String engine;
    private String color;
    private String seats;

    public BMWCar( String engine, String color,  String seats) {
        super(4, "diesel/petrol", "random",  "4");
        this.engine = engine;
        this.color = color;
        this.seats = seats;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSeats() {
        return seats;
    }

    public String drivingMode(String mode) {
        switch ( mode ){
            case "awd":
                return "all wheel drive";


            case "sport":
                return "sport mode activated";


            case "dynamic":
                return "dynamic mode activated";


            default:
                return "city mode activated";

        }
    }
}
