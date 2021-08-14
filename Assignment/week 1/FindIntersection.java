package seleniumSample1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	public static void main(String[] args) {
		
		  int [] arr= {2,4,6,5,8,9}; int [] arr1= {1,2,3,8,9,10};
		  
		  for(int i=0;i<arr.length;i++) 
		  { for(int j=0;j<arr1.length;j++) 
		  {
		  if(arr[i]==arr1[j])
		  { 
			  System.out.println("The intersection is " +arr[i]);
		  
		  
		  } } }
		  
		  
		  
		 
	     Integer[] firstArray = {0,1,2,3,4,5,6,7,8,9};
	     Integer[] secondArray = {1,3,5,7,9};
	      
	     HashSet<Integer> set = new HashSet<Integer>(); 
	      
	     set.addAll(Arrays.asList(firstArray));
	      
	     set.retainAll(Arrays.asList(secondArray));
	      
	     System.out.println(set);
	      
	     //convert to array
	     Integer[] intersection = {};
	     intersection = set.toArray(intersection);
	      
	     System.out.println(Arrays.toString(intersection));
	     
	 ///////////////////////////////////////////////////////////////////////////    
	     
	     String[] firstArray1 = {"A", "B", "C", "D"};
	     String[] secondArray2 = {"D", "A", "E", "F"};
	      
	     HashSet<String> arr3 = new HashSet<String>(); 
	      
	     arr3.addAll(Arrays.asList(firstArray1));
	      
	     arr3.retainAll(Arrays.asList(secondArray2));
	      
	     System.out.println(set);
	      
	     //convert to array
	     String[] intersectionstr = {};
	     intersectionstr = arr3.toArray(intersectionstr);
	      
	     System.out.println(Arrays.toString(intersectionstr));
	     
	  /////////////////////////////////////////////////////////////////////////   
	     Integer[] firstArray3 = {0,1,2,3,4,5,6,7,8,9};
	     Integer[] secondArray4 = {1,3,5,7,9}; 
	     
	     Set<Integer> hashSet = new HashSet<Integer>(); 
	     
	     hashSet.addAll(Arrays.asList(firstArray3));
	     
	     Set<Integer> hashSet1 = new HashSet<Integer>(); 
	     
	     hashSet1.addAll(Arrays.asList(secondArray4));
	     
	     hashSet1.retainAll(hashSet);
	     
	     System.out.println(hashSet1);
	     
	     hashSet.addAll(hashSet1);
		
	     System.out.println(hashSet);
	}
}


