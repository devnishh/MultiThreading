package com.jspider.Multithreading.Threads1;

public class Thread3 extends Thread{
	@Override
	public void run(){
		System.out.println("id : "+ this.getId());
		System.out.println("Name : "+ this.getName());
		System.out.println("priority : "+ this.getPriority());
	}
}
