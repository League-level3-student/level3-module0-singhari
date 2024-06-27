package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] test = new String[5];
		test[0] = "a";
		test[1] = "b";
		test[2] = "c";
		test[3] = "d";
		test[4] = "e";
		printer(test);
		reverser(test);
		onethree(test);
		randomer(test);
	}
   //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printer(String[] arr) {
		for(String value : arr) {
			System.out.println(value);
		}
	}
   //3. Write a method that takes an array of Strings and prints all the Strings in the array
   //   in reverse order.
	public static void reverser(String[] arr) {
		for(int i = arr.length-1; i > 0; i--) {
			System.out.println(arr[i]);
		}
	}
   //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void onethree(String[] arr) {
		for(int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
	}
   //5. Write a method that takes an array of Strings and prints all the Strings in the array
   //   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomer(String[] arr) {
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[ran.nextInt(arr.length)]);
		}
	}
}