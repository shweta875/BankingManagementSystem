package com.Assignment13;

public  class AccountImpl implements Account {
	String name;
	long  balance;

	@Override
	public void getSavingAccount() {
		AccountImpl a = new AccountImpl(name, balance);

		
	}
	

	

	public AccountImpl(String name, long balance) {
		super();
		this.name = name;
		this.balance = balance;
	}



	@Override
	public void getUserDetails(String name, long balance) {
		// TODO Auto-generated method stub
		System.out.println("account holder name>>  " + name);
		System.out.println("account balance>>  " + balance);

		
	}


}
