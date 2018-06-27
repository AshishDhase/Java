package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(124, 58);
        getDurationString(888);
    }

    public static String getDurationString(int minutes, int seconds) {
        if( (minutes >= 0) && ( (seconds >= 0) && (seconds <= 59) ) ) {
            int hrs = minutes / 60;
            int calculatedMinutes = minutes % 60;


            if( hrs < 10 && calculatedMinutes < 10 && seconds < 10){
                System.out.println("0"+hrs+"h 0"+calculatedMinutes+"m 0"+seconds+"s");

            }else{
                System.out.println(hrs+"h "+calculatedMinutes+"m "+seconds+"s");
            }
            return "calculated";
        }else {
            return "invalid value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >=0 ){
            int minutes = seconds / 60;
            int remSeconds = seconds % 60;

            getDurationString(minutes, remSeconds);

            return "done";
        }else {
            return "invalid value";
        }
    }
}
