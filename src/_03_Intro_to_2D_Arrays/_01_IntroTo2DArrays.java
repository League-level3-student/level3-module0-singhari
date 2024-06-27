package _03_Intro_to_2D_Arrays;

public class _01_IntroTo2DArrays {

	public static void main(String[] args) {
	       // 1. declare a 2D array of integers with 3, 1D arrays that each hold
	       //    3 integers
	   	int[][] arr2d = new int[3][3];
	       // 2. use two for loops to set all the elements in the 2D array to
	       //    a different integer
	       //    BE SURE TO USE THE ARRAY'S length VARIABLE
	   	for(int i = 0; i<arr2d.length; i++) {
	   		for(int j = 0; j < arr2d[i].length; j++) {
	   			arr2d[i][j] = i*j*i;
	   		}
	   	}
	      
	       // 3. print the third element from the second 1D array (2DArray[1][2])
	   		System.out.println(arr2d[1][2]);
	       // 4. set the third element from the second 1D array to a different
	       //    value
	   		arr2d[1][2] = 7;
	   		System.out.println(arr2d[1][2]);
	       // 5. print the element again and verify the value has changed
	   }

}
