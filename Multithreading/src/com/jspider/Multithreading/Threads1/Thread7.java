package com.jspider.Multithreading.Threads1;

public class Thread7 extends Thread{
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println("hellow from " + this.getName());
			if (i==3) {
				this.stop();
			}
		}
	}
	

}
