package com.jspider.Multithreading.Threads1;

public class Customer extends Thread{
	private Product product;

	public Customer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		product.order();
	}
}
