package week3.day1;

public class MethodOverloading {

	public void getStudentDetails() {
		int studId = 100;
		String studName = "Sharan";
		System.out.println(" student id of mthd1:" + studId);
		System.out.println(" Student Name of mthd1:" + studName);
	}

	public void getStudentDetails(String name) {
		System.out.println(" Student Name of mthd2:" + name);
	}

	public void getStudentDetails(int id) {
		System.out.println(" Student Name of mthd3:" + id);
	}

	public void getStudentDetails(int id, String name) {
		System.out.println(" student id of mthd4:" + id);
		System.out.println(" Student Name of mthd4:" + name);
	}

	public void getStudentDetails(String name, int id) {
		System.out.println(" student id of mthd5:" + id);
		System.out.println(" Student Name of mthd5:" + name);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getStudentDetails();
		obj.getStudentDetails("Swathi");
		obj.getStudentDetails(1001);
		obj.getStudentDetails(2000, "Prakash");
		obj.getStudentDetails("Pranav", 59968);
	}

}
