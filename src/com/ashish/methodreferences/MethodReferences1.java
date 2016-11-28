package com.ashish.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences1 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Ashish");
		names.add("Ramesh");
		names.add("Suresh");
		names.add("Kapil");
		names.add("Vinod");
		
		names.forEach(System.out::println);

	}

}
