package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerArrayList {
	/**
	 * This method shows adding the integers from an array to a list
	 * using a normal for loop. The data set is maintained as primitive data type (int)
	 *
	 */
	public void PrintUniqueValues() {
		int arr[] = { 3, 4, 5, 2, 2 };
		int arr1[] = { 4, 2, 1, 4 };

		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<Integer>();

		for (int j = 0; j < arr.length; j++) {
			intList.add(arr[j]);
		}
		for (int k = 0; k < arr1.length; k++) {
			intList1.add(arr1[k]);
		}

		// 1. Print unique elements in arr[]
		intList.removeAll(intList1);
		System.out.println("Unique elements in arr[] : " + intList);

	}
	
	/**
	 * This method shows adding the integers from an array to a list using Arrays.asList(arr1)
	 * For this, the data type should be of non primitive data type (wrapper class)
	 * ie. Integer arr[] = {} instead of inr arr[] ={}
	 * 
	 * it can be added using addAll() method or by directly passing to the constructor
	 */
	
	public void PrintDuplicateValues() {
		Integer arr[] = { 3, 4, 5, 2, 2 };
		Integer arr1[] = { 4, 2, 1, 4 };

		// mthd1 : to add using addAll()
		List<Integer> intList = new ArrayList<Integer>();
		intList.addAll(Arrays.asList(arr));

		// mthd2 : to add by directly passing to the constructor
		List<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(arr1));

		// 2.print the duplicates from arr1[]
		intList1.retainAll(intList);
		System.out.println("Duplicate elements in arr1[] : " + intList1);
	}
	
	/**
	 * This is to remove an integer value from the list
	 * Use Integer.valueOf() to get the desired result
	 */
	public void removeInteger() {
		int arr[] = { 3, 4, 5, 2, 2 };
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int j = 0; j < arr.length; j++) {
			intList.add(arr[j]);
		}
		
		/*
		 *  To remove the element 4 from the list
	        Below does not work out because the remove() accepts the index(which is an integer)
		    So, the below command removes the element that is in the index-4 
		    This removes 2 which is in the 4th index
		 */
		
		    intList.remove(4);
		    System.out.println(intList); // observe the output carefully
		    
		/*
		 *  To remove the element 4 from the list
		 *  Use Integer.valueOf()
		 *     
		 */
		
		intList.remove(Integer.valueOf(4));
		System.out.println(intList);
	}
	

	public static void main(String[] args) {
		IntegerArrayList obj = new IntegerArrayList();
		obj.PrintDuplicateValues();
		obj.PrintUniqueValues();
		obj.removeInteger();
	}
}
