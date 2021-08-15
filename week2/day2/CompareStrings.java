package week2.day2;

public class CompareStrings {
	public static void main(String[] args) {
		
		// Literal
		
				String s1 = "Welcome";
				String s2 = "Welcome";
				
				String s3 = new String("Welcome");
				
				if(s1==s2) {
					System.out.println("s1 s2 same");
				}
				else
					System.out.println("s1 s2 sdiff");
				
				
				if(s1==s3) {
					System.out.println("s1 s3 same");
				}
				else
					System.out.println("s1 s3 diff");
				

				
				String str2 = "Missing-Element-In-An-Array";
				str2.split("Missing");
				System.out.print(str2);
				System.out.println(str2.substring(8, 15));
				
				String str = "Rs.6758 cost";
				String replaceAll = str.replaceAll("\\D", "");
				System.out.println(replaceAll);

	}
}
