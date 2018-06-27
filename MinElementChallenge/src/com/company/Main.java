package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Enter the value for count: ");
        int count = scn.nextInt();

        int[] array = readIntegers(count);

        int minValue = findMin(array);
        System.out.println("Minimum element from the array is "+minValue);

    }

    private static int findMin(int[] array) {

     /*
     boolean flag = true;

        while (flag) {
            flag = false;

            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array [i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = true;
                }
            }
        }
     */
        int min = Integer.MAX_VALUE;
        System.out.println("Value of min = "+min);

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
            System.out.println("Value of min = "+min);
        }
        return min;
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Initialize array with "+count+" values");

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        return array;
    }
}
