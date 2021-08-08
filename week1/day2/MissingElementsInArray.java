package week1.day2;

public class MissingElementsInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,7,6,8};
		// 5 is missing
		// unsorted
		
		// step 1: sort the array
		
		// for loop
		   // if(index != element) --> index is the missing element
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i) {
				System.out.println(" missing element :" + i);
				break;
			}
		}
		
		
		
		
		
		
	}

}
