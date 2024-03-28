package com.jspider.Multithreading.Threads1;

public class Wife extends Thread{
	private Account account;

	public Wife(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		account.deposit(2000.00);
		account.widraw(1000.00);
	}
}
