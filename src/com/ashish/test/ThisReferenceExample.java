package com.ashish.test;

import com.ashish.test.ClosuresExample.Process;

public class ThisReferenceExample {

	public static void main(String args[]) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.execute();
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i : " + i);
			System.out.println(this);
		});
	}

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public String toString() {
		return "This is the main class ThisReferenceExample instance";
	}
}
