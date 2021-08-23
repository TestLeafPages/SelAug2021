package week3.day2;

public interface TaxCalculation {

	// default : public,static, final
	String cmpnyName = "Taxer";
	
	// no method body
	// unimplemented methods
	// Documentation
	
	/**
	 * This method calculates the deductions of a person/business unit/co-operative society
	 * Author : Sheriba
	 * @param name : Name of person/business unit/co-operative society
	 * @param HRA : House Rent allowance
	 * @param LTA : Allowance
	 */
	void calcDeductions(String name, double HRA, double LTA);
	
	/**
	 * This method calculates the gross income of a person/business unit/co-operative society
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
		
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	/**
	 * 
	 * @return : returns the tax slab for the person/business unit/co-operative society
	 */
	public int taxSlab();
	
		
	public double CalcTaxandPublishValue();
	
	/**
	 * This is the same as in IncomeCalculation interface
	 */
	public void commonMthd();
	
}
