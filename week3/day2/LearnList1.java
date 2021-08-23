package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList1{

	public static void main(String[] args) {
		// purpose
		//Syntax:
		// <> - generics
		// Wrapper Class
		// Empty list
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("mango");
		list.add("Star Fruit");
		list.add("WaterMelon");
		list.add("Orange");
		
		// Find the size of the list
		
		int listSize = list.size();
		System.out.println("listSize :" + listSize);
		
		// Print the list
		System.out.println(list);
		// To get an element from the list
				list.get(0);
			
		for (int i = 0; i < listSize; i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("For each");
		// for each
		// No index
		// No reverse iteration
		// dataType userdefined variable   source
		
		
		for (String eachString : list) {
			System.out.println(eachString);
		}
				
		// Insert an element into a list
		list.add(1, "Kiwi");
		System.out.println(list);
		
		
		// remove a value from the list
		// remove the first occurrence
		// remove using index
		list.remove(1);
		System.out.println(list);
		
		// remove using value
		list.remove("Orange");
		System.out.println(list);
		
		// flush out the list
		list.clear();
		System.out.println(list);
		

	}

}
