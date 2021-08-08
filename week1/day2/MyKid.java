package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		
		MyMobile kidObj = new MyMobile();
		float amps = kidObj.amps;
		System.out.println(" Amps value is :" + amps);
	
		kidObj.makeCalls();
		kidObj.takePics();
	//	kidObj.payMoney();  private method cannot be accesed

	}

}
