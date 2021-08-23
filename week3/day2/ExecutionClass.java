package week3.day2;

public class ExecutionClass {

	public static void main(String[] args) {
		// cannot instantiate  the interface
		// TaxCalculation objTax = new TaxCalculation();
		
		CalcIndividualsTax objIndiv = new CalcIndividualsTax();
		objIndiv.calcDeductions("Jasper", 100.567, 278439.43);
		objIndiv.calcGrossIncome(null, 0, 0);
		objIndiv.calcNetIncome(null, 0, 0);
		objIndiv.commonMthd();
		// inherited method
		objIndiv.getStudentDetails("Jasper");
		
		
		CalcBusinessTax obj2 = new CalcBusinessTax();
		
		
		
		
		
	}

}
