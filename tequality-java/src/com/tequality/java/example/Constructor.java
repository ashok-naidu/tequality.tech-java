package com.tequality.java.example;

public class Constructor {

	public static void main(String[] args) {
		
	// Creating person object with Default Constructor
		
		Person p1=new Person();
		
    // Creating person object with parameterize Constructor
		
		Person p2=new Person("tequality");

	}

}

class Person{
	
	// Default Constructor
	public Person() {
		
		System.out.println("Creating person object with Default Constructor"); 
		
	}
	
    // parameterize Constructor
	public Person(String name) {
		
		System.out.println("Creating person object with parameterize Constructor");
		
	}
}
