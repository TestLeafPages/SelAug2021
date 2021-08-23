package week1.day2;

/*
 * Subject: Mobile 
 * 
 * properties/ variable/ attributes (State)
 * 
 * screenSize - int
   cost - int
   logo - char
   amps - 1.5 - float
   mobileNumber - long
   isTouchScreen - boolean
   brandName - String
   
   
   Actions/ Behaviour/ methods (verb)
      
   makeCalls()
   textMsg()
   takeSnap()
   makeVideoCall()
   makePayments()
   makeShopping()
   takePicture()
 * 
 */
public class MyMobile {

	// variables
	// Instance variable ( global )
	int screenSize = 12;
	int cost;
	char logo;
	float amps = 1.5f;
	long mobileNumber;
	boolean isTouchScreen;
	String brandName;

	// method signature
	// AccessModifier returnType methodName (arguments){ method body}
	// public : accessed by all the classes in a project
	// private : Only that class can use it. cannot be accessed by anyothers
	// protected : same as package but when inherited
	// package/default : accessed in the package level
	
	
	/*
	 * void - empty/nothing
	 */

	public String makeCalls() {
		String callMsg = " Hello"; // local variable
		System.out.println(" Making calls");
		return callMsg;
	}

	public void takePics() {
		System.out.println(" Taking pictures");
	}

	private void payMoney() {
		System.out.println("Make payments");
	}
	
	
	
	public void makeSMS(String sms) {
		System.out.println("sms  :" + sms);
	}
	

	// main ()
	// Instance creation ( object)
	
	public static void main(String[] args) {
		// access the class variables and methods
		// craete object Instantiate( creating an instance)
		
		// syntax:
		//className objectName = new constructor
		MyMobile mobObj = new MyMobile();
		
		mobObj.takePics();
		
		String str = mobObj.makeCalls();
		System.out.println(str);
		
	//	mobObj.makeSMS("Hi");
		
		mobObj.payMoney();
		
	// 	ctrl + 2 ;  press L
	//  ctrl + 1 - choose the local variables assignment
		
		 int screenSize2 = mobObj.screenSize;
		 System.out.println(" screenSize :" + screenSize2);
	}
}
