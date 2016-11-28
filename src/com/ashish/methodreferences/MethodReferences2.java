package com.ashish.methodreferences;


public class MethodReferences2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String name = "Ashish" ;
		MethodReferences2 infoObj = new MethodReferences2();
		infoObj:display(name); // instead of '::' ':' colon is used 
	}

	private static void display(String name) {
		System.out.println("Welcome " + name);
	}

}
