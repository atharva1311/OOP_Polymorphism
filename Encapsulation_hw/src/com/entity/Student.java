package com.entity;

public class Student {
	private String name;
	private int roll;
	private int std;
	private int marks;

	public Student() {

	}

	public Student(String n, int r, int s, int m) {
		name = n;
		roll = r;
		std = s;
		marks = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String sname) {
		name = sname;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int sroll) {
		roll = sroll;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int sstd) {
		std = sstd;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int smarks) {
		marks = smarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	

}
