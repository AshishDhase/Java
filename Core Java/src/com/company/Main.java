package com.company;

public class Main {

    public static void main(String[] args) {
	    double feetAndInchesCentimeters = calcFeetAndInchesToCentimeters(5,12);
        System.out.println("Result of the (feet, inches) to centimeters: "+feetAndInchesCentimeters);
        double inchesToCentimeters = calcFeetAndInchesToCentimeters(55);
        System.out.println("Result of the (inches) to centimeter: "+inchesToCentimeters);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if( (feet >=0) && (inches >=0 && inches <=12 ) ){
            double feetToInches = feet * 12;
            double totalInches = feetToInches + inches ;
            double totalCentimeters = totalInches * 2.54;
            return totalCentimeters;
        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if( inches >= 0 ){
            double totalCentimeters = inches * 2.54;
            return totalCentimeters;
        }else {
            return -1;
        }
    }
}
