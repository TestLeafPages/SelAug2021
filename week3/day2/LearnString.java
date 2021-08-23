package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// Initialize a string
		// 2 ways:
		//  -- literals
		//  -- new keyword
		
		String str = "Welcome-To-Testleaf"; 
		// object is created in the name of str
		
		// String Length:
		
		int lengthStr = str.length();
		System.out.println(" length of the string:" + lengthStr);

        //Find a character in a String: in the 4th position
		char charStr = str.charAt(4);
		System.out.println(" Character:" + charStr);
		
		// Get the position of a character in the string:
		// give the first occurence of that char
		int indexOfChar = str.indexOf('T');
		System.out.println(" indexOfChar:" + indexOfChar);
		
		// last occurence
		int lastIndexOf = str.lastIndexOf('T');
		System.out.println(" lastIndexOf:" + lastIndexOf);
		
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"]: " + charArray[i]);
		}
		// Welcome To Testleaf
		String[] splitStr = str.split("-");
		
		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("splitStr["+i+"]: " + splitStr[i]);
		}
		
		
		
		
		
		
		
		

	}

}
