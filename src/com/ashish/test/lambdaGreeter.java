package com.ashish.test;

public class lambdaGreeter {

	public static void main(String[] args) {
		
		Greeting morningGreeter = () -> System.out.println("Good Morning");
		Greeting eveningGreeter = () -> System.out.println("Good Evening");
		
		morningGreeter.greet();
		eveningGreeter.greet();
		
	}

}
