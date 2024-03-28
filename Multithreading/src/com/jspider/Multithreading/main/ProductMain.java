package com.jspider.Multithreading.main;
import com.jspider.Multithreading.Threads1.Customer;
import com.jspider.Multithreading.Threads1.Merchant;
import com.jspider.Multithreading.Threads1.Product;

public class ProductMain {
public static void main(String[] args) {
	Product product = new Product();
	Customer customer = new Customer(product);
	customer.start();
	Merchant merchant = new Merchant(product);
	merchant.start();
}
}