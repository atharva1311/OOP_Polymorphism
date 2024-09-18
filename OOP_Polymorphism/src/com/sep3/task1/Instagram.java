package com.sep3.task1;

// Overloading (Compile time polymorphism)
public class Instagram {

	void login(String uname, String pass) {
		System.out.println("Your username and password is: " + uname + " & " + pass);
		System.out.println("Press signup button for login");
	}

	void login(int mob, String pass) {
		System.out.println("Your phone no and password is: " + mob + " & " + pass);
		System.out.println("Press signup button for login");
	}

}
