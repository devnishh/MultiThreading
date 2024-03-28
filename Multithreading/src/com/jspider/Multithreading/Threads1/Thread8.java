package com.jspider.Multithreading.Threads1;

import com.jspiders.multithreading.Resources.MyResources2;

public class Thread8 extends Thread{
	private MyResources2 myResources2;

	public Thread8(MyResources2 myResources2) {
		super();
		this.myResources2 = myResources2;
	}
	@Override
	public void run() {
		synchronized (myResources2.resource) {
			
		}
	}

}
