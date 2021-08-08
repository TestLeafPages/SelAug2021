package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize the array
		int[] arrNum = {34,203,5,78,100,1000,1};
	
		// Step 1: sort the array 
		Arrays.sort(arrNum);
		
		// Step 2: print the last element of the array
		System.out.println(" Largest element in the array:" + arrNum[arrNum.length-1]);
		
		// Step 3: print the second largest element of the array
		
		System.out.println(" Largest element in the array:" + arrNum[arrNum.length-2]);
		
		// Step 3: print the second smallest element of the array
		//Collections.reverse(arrNum);
		
		
		
		
		

	}

}
