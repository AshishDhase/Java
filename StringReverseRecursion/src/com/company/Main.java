package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter String to reverse");
        String s = scn.next();

        System.out.println(recursiveMethod(s));
    }

    private static String recursiveMethod(String s) {
        if ( (null == s) || (s.length() <= 1 )) {
            return s;
        }
        System.out.println(s.substring(1)+ s.charAt(0));
        return recursiveMethod(s.substring(1)) + s.charAt(0);
    }
}
