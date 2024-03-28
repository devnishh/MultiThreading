package com.jspider.Multithreading.Threads1;

public class Product {
	public boolean available;
	public synchronized void order() {
		System.out.println("Order is recived");
		if (available) {
			System.out.println("Product is deliverd");
		} else {
			System.out.println("Product is unavailable");
			System.out.println("Wait for some time");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (available) {
				System.out.println("product is delivered");
			}

		}
		
	}
	public synchronized void manufacture(){
		System.out.println("Product is manufacuring");
		System.out.println("product is ready");
		available = true;
		notify();
	}
	

}
