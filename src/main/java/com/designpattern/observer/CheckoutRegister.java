package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRegister implements Subject {

	private List<Observer> customers = new ArrayList<>();

	private String status = "CLOSED";

	@Override
	public void addObserver(Observer o) {
		customers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		customers.remove(o);
	}

	@Override
	public void notifyObserver() {
		System.out.println("Total customers : " + customers.size());
		if (!customers.isEmpty()) {
			System.out.println("Notifying customer " + customers.get(0));
			customers.get(0).update(this);
		}
	}

	public List<Observer> getCustomers() {
		return customers;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void checkout(Observer o) {
		if (o instanceof Customer) {
			status = "BUSY";
			System.out.println("Checking out customer " + ((Customer) o).getId());
			System.out.println("Checkout complete..");
			removeObserver(o);
			System.out.println("Pending customers: " + customers);
			System.out.println("-------------------------------------------------");
			status = "OPEN";
			notifyObserver();
		}
	}
}
