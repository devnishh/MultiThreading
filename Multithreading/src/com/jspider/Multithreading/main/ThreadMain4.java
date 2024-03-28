package com.jspider.Multithreading.main;

import com.jspider.Multithreading.Threads1.Thread4;
import com.jspider.Multithreading.Threads1.Thread5;
import com.jspiders.multithreading.Resources.MyResources1;

public class ThreadMain4 {
	public static void main(String[] args) {
		MyResources1 myResources1 = new MyResources1();
		Thread4 thread4 = new Thread4(myResources1);
		thread4.setName("Thread4");
		Thread5 thread5 = new Thread5(myResources1);
		thread5.setName("Thread5");
		thread4.start();
		thread5.start();
	}
}


