package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the no of elements you want to insert into an array");
        int num = scn.nextInt();
        int[] array = getIntegers(num);

        for(int i = 0; i < array.length; i++){
            System.out.println("Element inserted at "+i+" position is "+array[i]);
        }
        int[] sortedArray = sortArray(array);
        System.out.println("Printing sorted array...");

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    private static int[] getIntegers(int num) {
        int[] array = new int[num];
        for(int i = 0; i < array.length; i++){
            System.out.println("Insert element at "+i+" location: ");
            array[i]=scn.nextInt();
        }
        return array;
    }

    private static int[] sortArray(int[] arr) {

            boolean flag = true;

            while(flag) {
                flag = false;

                for (int i = 0; i < arr.length-1; i++) {
                    if ( arr[i] > arr[i + 1] ){
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        flag = true;
                    }
                }
            }



        return arr;
    }
}
