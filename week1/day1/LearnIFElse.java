package week1.day1;

// Problem statement : Identify if a number is even/odd/neutral
// exactly divisible by 2 OR remainder is 0
// input : integer

// Operators:
/*
 * = assignment operator
 *  additon : +
 *  subtraction : -
 *  division: /   20/10 = 2   (quotient)
 *  Multiplication : * 10 * 20 = 200
 *  remainder : mod operator %
 *            10%2 --> remainder = 0
 *  !=   --> not equal
 *    COMPARISON OPEARTORS:        
 *  and &&
 *  Or ||
 *  <= 
 *  >=
 *  ==  --> comparison the equality         
 */

public class LearnIFElse {
   // Conditional statement
	public static void main(String[] args) {
		int number = 1001;

		// if the condition is satisfied ( valuated to true)
		
		if (number == 0) {
			System.out.println(" The number is neutral");
		} else if (number % 2 != 0) { // remainder is not equal to zero
			System.out.println("The number is odd");
		} else {
			System.out.println("The number is even");
		}

		//

	}

}
