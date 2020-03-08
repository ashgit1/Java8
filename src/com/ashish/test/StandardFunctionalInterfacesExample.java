package com.ashish.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Ashish", "Gupta", 30), new Person("Arpitha", "Kumar", 24),
				new Person("Dikshitha", "Gonzalvez", 18), new Person("Kashi", "Tiwari", 54),
				new Person("Sunita", "Kaur", 50), new Person("Neha", "Kumari", 50));

		// Step 1: Sort List by last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2: create a method that prints all elements of the list
		printConditionally(people, p -> true, p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		// Step 3: create a method that prints all last names beginning with K
		System.out.println("Last Name Start with K");
		printConditionally(people, p -> p.getLastName().startsWith("K"), p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

		System.out.println("First Name Start with A");
		printConditionally(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p));
		System.out.println("-------------------------------------------------");

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}