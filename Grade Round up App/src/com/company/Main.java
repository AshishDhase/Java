package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of subjects: \r");
        int n = scn.nextInt();


	    int[] grades = new int[n];
        System.out.println("Enter grades for "+n+" subjects");

        for (int i=0; i < grades.length; i++ ) {
            grades[i] = scn.nextInt();
        }

        System.out.println("Entered grades are "+ Arrays.toString(grades));
        int[] finalGrades = finalResult(grades);
    }

    private static int[] finalResult(int[] grades) {
        int finalGrades[] = grades;

        for ( int i=0; i < finalGrades.length; i++) {
            if ( finalGrades[i] > 38) {
                int multi5 = finalGrades[i];
                while ( multi5 % 5 != 0) {
                    multi5++;
                }
                if ( multi5 - finalGrades[i] < 3) {
                    return multi5;
                }
            }
        }
    }
}
