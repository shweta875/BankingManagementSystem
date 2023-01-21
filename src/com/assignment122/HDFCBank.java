package com.assignment122;

public class HDFCBank extends Bank {
	
	
	public double getCalculateInterest(){
		double Interest=((principleAmount*tenure*rateOfInterest)/100);
		return Interest;

		
	}
	public void getHdfcDetails() {
		HDFCBank hdfc=new HDFCBank();
	System.out.println("hdfc bank");
	System.out.println("Principle Amount>>"+hdfc.principleAmount);
	System.out.println("tenure>>"+hdfc.tenure);
	System.out.println("rate of interest>>"+hdfc.rateOfInterest);
	System.out.println(hdfc.getCalculateInterest());
	
	}
	}



