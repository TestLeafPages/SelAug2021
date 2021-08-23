package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		Vehicle vehObj = new Vehicle();
		vehObj.accelrateVehicle();
		vehObj.applyBreak();
		vehObj.soundHorn();
		vehObj.driveVehicle();
		vehObj.reverseGear();
		
		System.out.println(" ************Call to Car class************");
		Car carObj = new Car();
		carObj.pushOnAirbag();
		carObj.accelrateVehicle();
		carObj.applyBreak();
		carObj.soundHorn();
		carObj.driveVehicle();
		carObj.reverseGear();
		int numOfWheels = carObj.numOfWheels;
		System.out.println(" Number of wheels in a car:" + numOfWheels);
		
		System.out.println(" *******Audi*******");
		Audi a = new Audi();
		a.applyBreak();
		
		 
		System.out.println(" ************Call to AUTO class************");
		
		Auto autoObj = new Auto();
		autoObj.accelrateVehicle();
		int numOfWheels2 = autoObj.numOfWheels;
		System.out.println(" Number of wheels in Auto :" + numOfWheels2);
		System.out.println(" ************Call to BMW class************");
		BMW b = new BMW();
		b.pushOnAirbag();
		b.applyBreak();
		b.driveVehicle();
		int numOfWheels3 = b.numOfWheels;
		System.out.println(" Number of wheels in BMW:" + numOfWheels3);
		
		
		
		
		
		
		
		
		
	}

}
