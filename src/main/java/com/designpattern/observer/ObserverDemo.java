package com.designpattern.observer;

/**
 * Observer pattern demo
 * 
 * @author Rajesh Bhoopathy Raju 
 */
public class ObserverDemo {

	public static void main(String[] args) {

		CheckoutRegister register = new CheckoutRegister();

		Customer c1 = new Customer(101);
		Customer c2 = new Customer(102);
		Customer c3 = new Customer(103);
		Customer c4 = new Customer(104);

		register.addObserver(c1);
		register.addObserver(c2);
		register.addObserver(c3);
		register.addObserver(c4);

		register.setStatus("OPEN");
		register.notifyObserver();
	}
}
