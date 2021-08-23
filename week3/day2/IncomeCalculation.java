package week3.day2;

public interface IncomeCalculation {
	
	/**
	 * 
	 * @param name
	 * @param income1
	 * @param income2
	 * @return
	 */
	public double calcNetIncome(String name, double income1, double income2);
	/**
	 * This is the same as in Tax calculation interface
	 */
	public void commonMthd();
}
