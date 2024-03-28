package com.jspider.Multithreading.Threads1;

import com.jspiders.multithreading.Resources.MyResources1;

public class Thread5 extends Thread{
	private MyResources1 myResources1;

	public Thread5(MyResources1 myResources1) {
		super();
		this.myResources1 = myResources1;
	}
	@Override
	public void run() {
		myResources1.message();
	}
}
