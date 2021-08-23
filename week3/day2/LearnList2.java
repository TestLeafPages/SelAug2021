package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LearnList2 {
	public static void main(String[] args) {
		String arr[] = { "Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura", "Audi" };
		// Empty List
		// Arrays.asList(arr) : converts the array to the list
		
		List<String> StrList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(StrList);
		
		//Sort a list
		Collections.sort(StrList);
		System.out.println(" Sorted  list");
		System.out.println(StrList);
		
		// reversing a list
		Collections.reverse(StrList);
		System.out.println(" reversed list");
		System.out.println(StrList);
		
		// Copy the elements from one list to another list
		// addAll()
		
		List<String> copyStrList = new ArrayList<String>(StrList);
		System.out.println(" Copy of the list");
		System.out.println(copyStrList);
		
			
		boolean contains = copyStrList.contains("Bugatti1");
		System.out.println(contains);
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
