package com.ashish.test;

public class Greeter {
	
	static MorningGreeting mg;
	static EveningGreeting eg;
	
	public void greetUser(Greeting greetMessage) {
		greetMessage.greet();
	}
	
	public static void main(String[] args) {
		mg = new MorningGreeting();
		eg = new EveningGreeting();
		new Greeter().greetUser(eg);
	}
}
