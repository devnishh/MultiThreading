package com.jspider.Multithreading.Threads1;

public class Thread6 extends Thread{
	private String message;

	public Thread6(String message) {
		super();
		this.message = message;
	}
	@Override
	public void run() {
		char[] arr = message.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 