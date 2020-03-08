package com.ashish.test;

public class ClosuresExample {

	public static void main(String[] args) {
		
		int i = 10;
		int b = 20;
		
		doProcess(i, p -> System.out.println(i+b) );
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}

	interface Process {
		void process(int i);
	}
}
