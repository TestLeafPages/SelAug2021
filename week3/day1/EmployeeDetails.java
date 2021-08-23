package week3.day1;

public class EmployeeDetails {
	
	// what does this do?
	// allocates the space
	// called during an object instatntiation/creation
	// Constructors are used to assign values to the class variables 
	   //at the time of object creation.
	// doesnot have any return type
	// same name as that of the class
	// default constructor - implicitly called by the compiler
	// It is the first call in a class
	
	// global// instance variables
	// when not initialised will have either 0 or null 
	

    //this keyword refers to the current object in a method or constructor.

  //to eliminate the confusion between class attributes and parameters with the same name
  // (because a class attribute is shadowed by a method or constructor parameter)
	
	
	
	int id;
	String name;
	
	
	public EmployeeDetails() {
		System.out.println(" Default constructor");
	}
	
	
	// parametrised constructor
	public EmployeeDetails(int id, String name) {
	//	this();  // default constructor is called
		
		System.out.println(" Parametrised constructor");
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
//		EmployeeDetails obj = new EmployeeDetails();
			
		EmployeeDetails obj = new EmployeeDetails(100,"sheriba");
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(" Call after the constructor");

	}

}
