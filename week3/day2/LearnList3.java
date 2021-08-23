package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnList3 {
	public static void main(String[] args) {
		String arr[] = {"Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura", "Audi" };
		String arr1[] = {"Bugatti", "Bentley", "Alfa Romeo", "Acura" };
		
		List<String> strList1 = new ArrayList<String>(Arrays.asList(arr));
		List<String> strList2 = new ArrayList<String>(Arrays.asList(arr1));
		
		
		strList1.removeAll(strList2);
		System.out.println(strList1);
		// [Aston Martin, Buick, Audi]
		// duplicates are removed 
		// Unique e,emnts are retained
		
		
		//strList1.retainAll(strList2);
		//System.out.println(strList1);
		// [Bugatti, Bentley, Alfa Romeo, Acura]
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
