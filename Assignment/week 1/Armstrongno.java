package seleniumSample1;


public class Armstrongno {

	public static void main(String[] args) {
		 int n = 153;
			int c= 0;
			int r,o;
			
			 o=n;
			 while(n>0)
			 { 
				r=n%10;
				c=c+(r*r*r);
				 n=n/10;
			 }
					
			 if(o==c)		
			           {
						System.out.println("Its an Armstrong Number");
						}
					else 
					{ 
						System.out.println("Its not an Armstrong number");	
					
		                } 
			




	}}






















/*int findprime = 13;
// boolean flag =false;

int n = findprime / 2;

for (int i = 2; i <= n / 2; i++) {
	if (findprime % i == 0) {
		System.out.println(findprime + "   is not a prime number");
		// flag=true
		break;
	} else
	{
		System.out.println(findprime + "   is  prime number");
	}*/
	/*
	 * if (flag == false) { 
	 * System.out.println(findprime + " is prime number");
	 *  }
	 * else { 
	 * System.out.println(findprime + "   is not a prime number"); 
	 * }
	 */		

