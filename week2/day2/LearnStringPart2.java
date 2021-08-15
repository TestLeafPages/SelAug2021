package week2.day2;

public class LearnStringPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Happy Independence Day";
		// print Independence Day
		String substring = str.substring(6);
		System.out.println("substring:" + substring);
		
		// start index is inclusive
		// end index is exclusive
		//index of H = 0
		//index of y = 4		
		String substring2 = str.substring(0, 5);
		System.out.println("substring:" + substring2);
		
		
		String replace = str.replace('p', 'P');
		System.out.println(" Replaced str:" + replace);
		
		
		String str1 = "TestLeaf102839";
		// characters, integers, spl chrs
		// expect : 102839
		//  replaced the non integers ( D) by null
		String replaceAll = str1.replaceAll("\\D", "");
		System.out.println(" numbered output:" + replaceAll);
		// 102839 -- string
		// convert it to an integer
		
		int parseInt = Integer.parseInt(replaceAll);
		int a = parseInt + 10;
		System.out.println(a);
		
		//string-- Rs.46
		//add 10 to it
		
		// replaceAll()
		// String of 46
		// convert to integer
		// add 10 to it
		
		
		
		
	/*	
		// Regular Expression - RegEX (video)
		// expect : TestLeaf
		// d -
		String replaceAll1 = str1.replaceAll("\\d", "");
		System.out.println(replaceAll1);
		
	*/	
		// compare the strings
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
