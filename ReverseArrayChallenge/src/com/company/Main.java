package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the value of count:  ");
        int count = scn.nextInt();
        System.out.println("Enter "+count+" values in array: ");
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
            scn.nextLine();
        }
        System.out.println("Array: "+ Arrays.toString(array));
        reverse(array);

        //    System.out.println("Reversed array: "+Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int count = array.length-1;
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
          //  for (int j = i; j >= i ; j--) {

                System.out.println("value of i "+i);
                System.out.println("In nested for count = "+count);

                reverseArray[i] = array[count];

                count--;

                System.out.println("In nested for array["+i+"] ="+array[i]);
            //}

            //System.out.println("In outer for array["+i+"] = " +array[i]);
            //System.out.println(array[i]);

        }
        System.out.println("Reversed array: "+Arrays.toString(reverseArray));
        //array = reverseArray;
    }
}
