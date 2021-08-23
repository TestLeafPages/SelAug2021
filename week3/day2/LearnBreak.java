package week1.day2;
// Jumping :
/*
 * break : 
 * continue
 * return
 */
public class LearnBreak {
	public static void main(String[] args) {

		 for (int i = 0; i < 10; i++) {  // loop
			 if(i==5) { // statement
				 break;
			 }
			 System.out.println(i);
		}
		 
		 System.out.println("out of the for loop");
	}
}
