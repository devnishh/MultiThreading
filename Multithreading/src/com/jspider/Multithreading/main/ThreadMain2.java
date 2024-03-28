package com.jspider.Multithreading.main;

import com.jspider.Multithreading.Threads1.Thread2;

public class ThreadMain2 {
public static void main(String[] args) {
	Thread2 thread2 =new Thread2();
	Thread thread = new Thread(thread2);
	thread.start();
}
}
