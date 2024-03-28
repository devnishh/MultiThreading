package com.jspider.Multithreading.main;

import com.jspider.Multithreading.Threads1.Thread3;

public class ThreadMain3 {
public static void main(String[] args) {
	Thread3 thread3 = new Thread3();
	thread3.setName("HELoo");
	thread3.setPriority(9);
	thread3.getId();
	
	thread3.start();
			
}
}
