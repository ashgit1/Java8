package com.ashish.lamda;

interface GreetService{
	void sayMessage(String message);
}

public class LambdaTester2 {

	final static String greeting = "Welcome ";
	
	public static void main(String[] args) {
		GreetService greet = (String message) -> System.out.println(greeting + message);
		greet.sayMessage("Ashishkumar Gupta");
	}
}
