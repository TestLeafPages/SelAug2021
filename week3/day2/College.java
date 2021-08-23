package week3.day2;

public class College extends University{

	@Override
	void ug() {
		// TODO Auto-generated method stub
		System.out.println("UG");
	}

	public static void main(String[] args) {
		College obj = new College();
		obj.ug();
		obj.pg();
	}
	
	// when an object is created for a child class , implicitly an object is created  
	   // for the parent class
	

}
