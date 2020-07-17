package com.bynubian.test;

public class Person {

	static int counter;
	
	public Person() {
		System.out.println("Id "+counter++);
	}
}
