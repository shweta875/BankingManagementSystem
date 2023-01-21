package com.assignment122;

public class ICICIBank extends Bank {
	public double getCalculateInterest(){
		double Interest=((principleAmount*tenure*rateOfInterest)/100);
		return Interest;
	}
	public void getICICIDetails() {
		ICICIBank ic =new ICICIBank();
	System.out.println("icici bank");
	System.out.println("Principle Amount>>"+ic.principleAmount);
	System.out.println("tenure>>"+ic.tenure);
	System.out.println("rate of interest>>"+ic.rateOfInterest);
	System.out.println(ic.getCalculateInterest());
	
	}

}
