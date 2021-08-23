package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> strSet = new  TreeSet<String>();
		
		strSet.add("mango");
		strSet.add("oarnge");
		strSet.add("jack");
		strSet.add("kiwi");
		boolean add = strSet.add("apple");
		System.out.println("is added:" + add);
		
		strSet.add("water melon");
		strSet.add("aaaaa");
		
		boolean add2 = strSet.add("apple");
		System.out.println(add2);
		
		strSet.add("apple");
		
		// no get method in set
		// in list get(index) -- i in the for loop
		// for loop - can it be used
		
		// for each loop is used
		// there is no iterator
		System.out.println(" printed using for each");
		for (String string : strSet) {
			System.out.println(string);
		}
		
					
		// Set<String> strSet = new  HashSet<String>();
		// [apple, kiwi, water melon, oarnge, jack, mango]
		
		//Set<String> strSet = new  LinkedHashSet<String>();
		// [mango, oarnge, jack, kiwi, apple, water melon]
		
		//Set<String> strSet = new  TreeSet<String>();
		//[apple, jack, kiwi, mango, oarnge, water melon]
		
		
		//System.out.println(strSet);
		
		
	//	strSet.removeAll(strSet)
	//	strSet.retainAll(strSet)

	}

}
