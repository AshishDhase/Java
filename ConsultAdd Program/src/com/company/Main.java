package com.company;

import java.util.Arrays;

public class Main {
	static int[] array = {1,25,56,4,1,2,11,11,4,2,3,3,52,56,8,1,4,4,4};
    public static void main(String[] args) {

	    int count;
		System.out.println(Arrays.toString(array));
	    for (int i=0; i < array.length  ; i++) {
			count = 0;
	    	if (checkElement( i)){
				for (int j=0; j < array.length; j++){
					if (array[i]==array[j]){

						count++;
					}

				}
				if (count == 1){
					count = 0;
					System.out.println(array[i]+" is repeated "+count+" times");
				}else {
					System.out.println(array[i]+" is repeated "+count+" times");
				}


            }

        }

    }

	private static boolean checkElement(int i) {
    	for (int j = 0; j < i ; j++) {
    		if (array[j] == array[i]) {
				return false;
			}
		}
		return true;
	}
}
