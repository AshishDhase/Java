package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int x1,v1,x2,v2;
        System.out.println("Enter the value for x1");
        x1 = scn.nextInt();

        System.out.println("Enter the value for v1");
        v1 = scn.nextInt();

        System.out.println("Enter the value for x2");
        x2 = scn.nextInt();

        System.out.println("Enter the value for v2");
        v2 = scn.nextInt();

        System.out.println("Result: "+kangaroo(x1, v1, x2, v2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && ((x2 - x1) % ( v1 - v2) == 0) ) {
            return "Yes";
        }else {
            return "No";
        }
    }
}
