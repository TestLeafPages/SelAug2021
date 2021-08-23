package week3.day2;

import week3.day1.MethodOverloading;

public class CalcIndividualsTax extends MethodOverloading implements TaxCalculation, IncomeCalculation {

	public static int indivTax = 2000;

	public void calcDeductions(String name, double HRA, double LTA) {
		
		System.out.println(cmpnyName);
		// final - annot be changed
		// cmpnyName = "Taxer2";
		
		
		
		System.out.println("calcDeductions for individual");
		double deduction = HRA + LTA;
		System.out.println(" deduction:" + deduction);
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		System.out.println("calcGrossIncome for individual");
	}

	public int taxSlab() {
		System.out.println(" Return tax slab for the individual");
		// TODO Auto-generated method stub
		return 0;
	}

	public double CalcTaxandPublishValue() {
		System.out.println(" Publih the tax value of an individual");
		// TODO Auto-generated method stub
		return 0;
	}

	public void commonMthd() {
		// TODO Auto-generated method stub

	}

// this is from IncomeCalculation Interface
	public double calcNetIncome(String name, double income1, double income2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
