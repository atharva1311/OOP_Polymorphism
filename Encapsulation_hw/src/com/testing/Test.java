package com.testing;

import com.entity.Student;
import com.service.Service;

public class Test {
	public static void main(String[] args) {
		Service ser1 = new Service();
		Student stud1 =ser1.m1();
		System.out.println("Name of the student is: "+stud1.getName());
		System.out.println("Roll no of the student is: "+stud1.getRoll());
		System.out.println("Standard of the student is: "+stud1.getStd());
		System.out.println("Marks of the student is: "+stud1.getMarks());
		
		
		
	}

}
