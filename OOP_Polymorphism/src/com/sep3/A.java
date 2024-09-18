package com.sep3;

//Polymorphism:-
//Overloading
public class A {
	void m1() {
		System.out.println(123);
	}

	void m1(int a) {
		System.out.println(123+a);
	}

	A() {
		System.out.println("This is non parameterized constructor");
	}

	A(int x) {
		System.out.println("This is prameterized constructor " + x);
	}

}
