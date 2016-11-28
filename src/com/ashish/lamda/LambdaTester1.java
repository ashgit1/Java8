package com.ashish.lamda;

interface MathOpeartion{
	int operation(int a, int b);
}

interface GreetingService{
	void sayMessage(String message);
}

public class LambdaTester1 {

	public static void main(String[] args) {
		
		LambdaTester1 tester = new LambdaTester1();
		
		// with type declaration
		MathOpeartion addition = (int a, int b) -> a + b;
		
		// without type declaration
		MathOpeartion subtraction = (a, b) -> a - b ;
		
		// with return statement along with curly brace
		MathOpeartion multiplication = (a, b) -> { return a * b ;};
		
		// without return statement and without curly brace
		MathOpeartion division = (a, b) -> a / b ;
		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 2 = " + tester.operate(10, 5, division));

		// Greeting Service without paranthesis
		GreetingService greet1 = message1 -> System.out.println("Hello " + message1);
		
		// Greeting Service with paranthesis and type declaration
		GreetingService greet2 = (String message2) -> System.out.println("Welcome " + message2);
		
		greet1.sayMessage("Ashish");
		greet2.sayMessage("Kumar");
	}
	
	private int operate(int a, int b, MathOpeartion mathOperation){
		return mathOperation.operation(a, b);
	}

}
