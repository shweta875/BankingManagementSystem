package com.assignment12;

public class Test {
	public static void main(String[] args) {
		Account ac =new Account();
		SavingAccount sa=new SavingAccount();
		
		System.out.println(ac.AccountName);
		System.out.println(ac.accountNumber);
		ac.getAccountDetails();
		ac.getAccountInformation();
		
		System.out.println(sa.AccountName);
		System.out.println(sa.accountNumber);
		System.out.println(sa.accountType);
        System.out.println(sa.balance);
        sa.getAccountDetails();
        sa.getAccountInformation();
		sa.getSaviingAccountDetails();
		sa.getSavingAccountInformation();
		
		
	}

}
