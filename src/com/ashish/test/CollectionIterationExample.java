package com.ashish.test;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Ashish", "Gupta", 30), new Person("Arpitha", "Kumar", 24),
				new Person("Dikshitha", "Gonzalvez", 18), new Person("Kashi", "Tiwari", 54),
				new Person("Sunita", "Kaur", 50), new Person("Neha", "Kumari", 50));

		people.forEach(p -> System.out.println(p)); // lambda
		people.forEach(System.out::println); // method reference of type p -> method(p)
	}
}
