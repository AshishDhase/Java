package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-222));
        System.out.println(sumDigits(125));
    }

    public static int sumDigits ( int number ) {
        if( number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int lsb = number % 10;
            sum+= lsb;
            number = number/10;
            System.out.println(lsb+" "+number);

        }
            return sum;
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;
        boolean condition = true;
        while(condition) {
            int digit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + digit;
            number = number/10;

            if (number == 0) {
                condition = false;
            }
        }
        System.out.println("reverse: "+reverse);
        System.out.println("number: "+number);
        if( originalNumber == reverse ){
            System.out.println("in if");
            return true;
        }else{
            return false;
        }
    }
}
