package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] str = {"cab","osteoporsis","what","alaska","double trouble"};
        // 2. print the third element in the array
    	System.out.println(str[2]);
        // 3. set the third element to a different value
    	str[2] = "cruise";
        // 4. print the third element again
    	System.out.println(str[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i < str.length; i++) {
    		str[i] = ""+(i+1);
        	System.out.println(str[i]);
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
    	int[] holymoly = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for(int i = 0; i < 50; i++) {
    		holymoly[i] = ran.nextInt(100);
    	}
    	int smallest = 100;
    	for(int ali : holymoly) {
    		if(ali < smallest) {
    			smallest = ali;
    		}
    	}
    	System.out.println(smallest);
    	
    	for(int i = 0; i < 50; i++) {
    		System.out.print(holymoly[i] + " ");
    	}
    	
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.
      	System.out.println("   ");
    	int largest = -1;
    	for(int ali : holymoly) {
    		if(ali > largest) {
    			largest = ali;
    		}
    	}
    	System.out.println(largest);
    	
        // 12. print only the last element in the array
    	System.out.println(holymoly[holymoly.length-1]);
    }
}
