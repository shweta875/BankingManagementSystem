package com.assignment122;

public class SBIBank extends Bank {
	public double getCalculateInterest(){
		double Interest=((principleAmount*tenure*rateOfInterest)/100);
		return Interest;
	}
	public void getssbiDetails() {
		SBIBank sbi=new SBIBank();
	System.out.println("sbi bank");
	System.out.println("Principle Amount>>"+sbi.principleAmount);
	System.out.println("tenure>>"+sbi.tenure);
	System.out.println("rate of interest>>"+sbi.rateOfInterest);
	System.out.println(sbi.getCalculateInterest());
	
	}

}
