package com.designpattern.singleton;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {
		// Private constructor to prevent instantiation
		if (singleton != null) {
			throw new RuntimeException("** Violating singleton pattern **");
		}

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("\nSingleton object is null. Creating new instance..");
			singleton = new Singleton();
		}
		return singleton;
	}
}