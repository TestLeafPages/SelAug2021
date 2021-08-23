package week1.day2;
/*
 * To print only the odd numbers
 * skip all the even numbers
 * 
 */
public class printOddNumbersContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 0; i <= 10; i++) {  // loop
			 // if()
			 if(i%2 == 0) { // statement
				 continue;    // skip
			 }
			 System.out.println(i);
		}
		
	}

}
