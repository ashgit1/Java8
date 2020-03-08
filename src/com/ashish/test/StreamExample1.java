package com.ashish.test;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Ashish", "Gupta", 30), new Person("Arpitha", "Kumar", 24),
				new Person("Dikshitha", "Gonzalvez", 18), new Person("Kashi", "Tiwari", 54),
				new Person("Sunita", "Kaur", 50), new Person("Neha", "Kumari", 50));

		people.stream()
		.filter(p -> p.getFirstName().startsWith("A"))
		.forEach(p -> System.out.println(p.getLastName()));
		
		// More streams..
		long count = people.parallelStream()  // Divide the operations if required on multiple cores for faster processing...
		.filter(p -> p.getFirstName().startsWith("A"))
		.count();
		System.out.println(count);
	}
}
