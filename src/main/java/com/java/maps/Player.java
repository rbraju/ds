package com.java.maps;

import java.util.Comparator;

public class Player implements Comparator<Player> {

	private String name;
	
	private int age;
	
	private char gender;

	public Player(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return name + "-" + age + "-" + gender;
	}

	@Override
	public int compare(Player p1, Player p2) {
		if (p1.getAge() > p2.getAge()) {
			return 1;
		} else if (p1.getAge() < p2.getAge()) {
			return -1;
		} else {
			return 0;
		}
	}
}
