package com.jspider.Multithreading.main;

import com.jspider.Multithreading.Threads1.Account;
import com.jspider.Multithreading.Threads1.Husband;
import com.jspider.Multithreading.Threads1.Wife;

public class AccountMain {
public static void main(String[] args) {
	Account account = new Account(1000.00);
	Husband husband = new Husband(account);
	Wife wife = new Wife(account);
	husband.start();
	wife.start();
}
}
