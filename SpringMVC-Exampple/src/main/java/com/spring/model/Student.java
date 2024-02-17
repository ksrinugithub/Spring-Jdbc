package com.spring.model;

public class Student {
	private String name;
	private String address;
	private int roll;

	public Student(String name, String address, int roll) {
		this.roll = roll;
		this.address = address;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void show() {

		System.out.println("Student name is:" + name + "-------" + "Student address is:" + address + "---------"
				+ "Student roll is:" + roll);
	}
}
