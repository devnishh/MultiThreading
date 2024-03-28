package com.jspider.Multithreading.Threads1;

public class Merchant extends Thread{
	private Product product;

	public Merchant(Product product) {
		super();
		this.product = product;
	}
	@Override
	public void run() {
		if (!product.available) {
			product.manufacture();
		}
	}
	
}
