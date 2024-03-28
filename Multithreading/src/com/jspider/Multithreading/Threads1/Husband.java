package com.jspider.Multithreading.Threads1;

public class Husband extends Thread {
	private Account account;

	public Husband(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		account.deposit(10000.00);
		account.widraw(200.00);
	}
}
