package week3.day2;

public class CalcBusinessTax implements TaxCalculation{

	public void calcDeductions(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		
	}
	public void calcGrossIncome(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		System.out.println("calcDeductions for business");
		double gross = netIncome + deductions;
		System.out.println(" deduction:" + gross);
	}

	public int taxSlab() {
		System.out.println(" Return tax slab for the business");
		return 0;
	}

	public double CalcTaxandPublishValue() {
		// TODO Auto-generated method stub
		System.out.println("CalcTaxandPublishValue for business");
		return 0;
	}
	
	// own method of a class
	public void extraIncome() {
		System.out.println(" Class own Method - business entity");
	}
	public void commonMthd() {
		// TODO Auto-generated method stub
		
	}

}
