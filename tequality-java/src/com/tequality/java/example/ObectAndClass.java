package com.tequality.java.example;

public class ObectAndClass{

	public static void main(String[] args) {
		
		// Creating object for WebDriver Class
	
		WebDriver driver = new WebDriver("Chrome");

    }

}

// Defining WebDriver class

class WebDriver{
	
	String browser;

	WebDriver(String browser)
	{
		System.out.println("Creating Object for "+ browser +" browser");
		this.browser=browser;
	}
	
}