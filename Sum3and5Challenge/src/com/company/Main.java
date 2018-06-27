package com.company;

public class Main {

    static int sum=0;

    public static void main(String[] args) {
	// write your code here
        /*
            int sum = 0;
            int count = 0;
            for(int i = 1; i<=1000; i++) {


                if( (i%3 == 0) && (i%5 == 0) ) {

                    count++;
                    System.out.println("Number which is divided by 3 and 5: "+i);

                    sum += i;
                    if( count == 5 ) {
                        break;
                    }
                }
            }

            System.out.println("Sum of such number is: "+sum);
            */

        System.out.println(sumOdd(10,20));
    }

    public static boolean isOdd (int number) {
        if( (number > 0) && (number%2 == 1) ) {
            return true;
        }
        return false;
    }

    public static int sumOdd (int start, int end) {
        if( (end >= start) && (start>0 && end > 0) ) {
            for( int i = start; i <= end; i++) {
                if ( isOdd(i) ){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
