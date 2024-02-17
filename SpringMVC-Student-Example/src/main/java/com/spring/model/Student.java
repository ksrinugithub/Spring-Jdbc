package com.spring.model;

public class Student {
	private String name;
	private String address;
	private int roll;

	public Student(String name, String address, int roll) {
		this.name = name;
		this.address = address;
		this.roll = roll;

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

	public void display() {
		System.out.println("Student name:" + name + "----------" + "Student address:" + address + "-------"
				+ "Student roll:" + roll);
	}

}
