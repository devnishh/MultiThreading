package com.jspiders.multithreading.Resources;

public class MyResources1 {
	public void message(){
	for(int i=0;i<=5;i++) {
		System.out.println("hellow from my resources1" +Thread.currentThread().getName());
		
	}
}
}
