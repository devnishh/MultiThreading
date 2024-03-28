package com.jspider.Multithreading.Threads1;

public class Account {
     private double accountBalance;

	public Account(double accountBalance) {
		super();
		this.setAccountBalance(accountBalance);
	}
     public synchronized void deposit(double amount) {
    	 System.out.println("Amount of rupee is "+ amount+ " is creadited");
    	 setAccountBalance(getAccountBalance() + amount);
    	 
     }
     public synchronized void widraw(double amount) {
    	 System.out.println("Amount of rupee is " + amount + " is creadited");
    	 setAccountBalance(getAccountBalance() + amount);
    	 
     }
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}
