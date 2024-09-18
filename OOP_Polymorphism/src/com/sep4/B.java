package com.sep4;

public class B extends A {

	String str = "TKA";

	void m3() {
		System.out.println("This method is from class B");
	}

	@Override
	protected void m1() {
		System.out.println("This is overriden method of class B");
	}
	@Override
	void marry()
	{
		System.out.println("Marry with girl B");
	}

}
