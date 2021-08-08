package week1.day2;

public class LearnReturnVar {

	// giving out a result
	public int add() {
		int x = 10, y = 34;
		int z = x+y;
		return z;
	}
	
	
	// seeks an arguments
	public void sub(int x, int y) {
		int c = x-y;
		System.out.println(" Subtracted value :" + c);
	}
	
	
	public static void main(String[] args) {
		
		LearnReturnVar obj = new LearnReturnVar();
		int result = obj.add();
		System.out.println("result for add mthd:"+ result);
		
		obj.sub(result, 10);
		
		
		

	}

}
