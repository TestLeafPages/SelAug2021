package seleniumSample1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
			String str1="stops";
					String str2="posts";
							String 	str1a; 
							String 	str2b;
			char[] stra= {}; 
			char[]	strb= {};
						 
				stra=str1.toCharArray();
			
				strb=str2.toCharArray();
			Arrays.sort(stra);
			Arrays.sort(strb);
			str1a=String.valueOf(stra);
			str2b=String.valueOf(strb);
			System.out.println("Given String : "+str1+" & "+str2);
			System.out.println("Sorted String : "+str1a+" & "+str2b);
			
			if (str1a.equals(str2b))
				System.out.println("Given Strings \" "+str1+ "\" & '"+str2+"' are Anagram" );
			else
				System.out.println("Given Strings \" "+str1+ "\" & '"+str2+"' are not Anagram" );
	}

}
