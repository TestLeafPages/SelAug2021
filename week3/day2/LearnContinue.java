package week1.day2;


/*
 * To print only the odd numbers
 * skip all the even numbers
 * 
 */
public class LearnContinue {

	public static void main(String[] args) {

		 for (int i = 0; i < 10; i++) {  // loop
			 if(i==5) { // statement
				 continue;    // skip
			 }
			 System.out.println(i);
		}
		

	}

}
