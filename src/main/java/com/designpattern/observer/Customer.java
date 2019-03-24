package com.designpattern.observer;

public class Customer implements Observer {

	private int id = 0;

	Customer(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public void update(Object o) {
		if (o instanceof CheckoutRegister && ((CheckoutRegister) o).getStatus().equals("OPEN")) {
			((CheckoutRegister) o).checkout(this);
		}
	}

	public String toString() {
		return id + "";
	}
}
