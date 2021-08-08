package week1.day2;

import java.util.Arrays;

/*
 * Array :  Arrays are used to store multiple values in a single variable
 * 
 */
public class LearnArrays {
	
	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "Blessed";
		
		// Array initialization
		
		// string array
		String[] str = {"Hi", "Hello", "Welcome", "Blessed"};
		
		// integer array
		int[] arrNum = {34,203,5,78,100,1000,1};
		
		// index:
		// to access the element the third element
		
		int value = arrNum[2];
		System.out.println(" Third value :"+ value);
		
		// To get the number of elements in an array
		 int lengthArr = arrNum.length;
		 System.out.println(" Length of array:" + lengthArr);
		 
		 
		// To get all the values of the array
		 for (int i = 0; i <= arrNum.length-1; i++) {
			 System.out.println("arrNum[" + i + "]=" + arrNum[i] );
		 }
		 
		 // Sort the array
		 Arrays.sort(arrNum);
		 System.out.println(" sorted array");
		 for (int i = 0; i <= arrNum.length-1; i++) {
			 System.out.println("arrNum[" + i + "]=" + arrNum[i] );
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
