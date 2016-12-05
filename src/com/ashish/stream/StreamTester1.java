package com.ashish.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTester1 {

	public static void main(String[] args) {
		
		System.out.println("------------------forEach()------------------------");
		
		// forEach()
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);
		
		System.out.println("------------------map()------------------------");
		
		// map()
		List<Integer> numbers = Arrays.asList(3, 2, 5, 9, 7, 8);
		// get the list of unique squares
		List<Integer> squareList = numbers.stream().map( i -> i*i).distinct().
									collect(Collectors.toList());
		squareList.forEach(System.out::println);
		
		System.out.println("--------------------filter()----------------------");
		
		// filter()
		List<String> strings = Arrays.asList("abc", "bs", "", "efg", "absh", "", "msk");
		// get count of empty String
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty string # " + count);
		
		System.out.println("--------------------limit()----------------------");
		
		// limit()
		Random random2 = new Random();
		random2.ints().limit(4).forEach(System.out::println);
		
		System.out.println("-------------------sort()-----------------------");
		
		// sort()
		Random random3 = new Random();
		random3.ints().limit(5).sorted().forEach(System.out::println);
		
		System.out.println("-------------------parallelStream()-----------------------");
		
		List<String> strings2 = Arrays.asList("abc", "", "bc", "", "abcd","", "jkl");
		//get count of empty string
		long count2 = strings2.parallelStream().filter(string2 -> string2.isEmpty()).count();
		System.out.println("Empty String using parallelStream " + count2);
		
		System.out.println("---------------------Collectors()---------------------------");
		
		List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings3.stream().filter(string3 -> !string3.isEmpty()).
								collect(Collectors.toList());
		filtered.forEach(System.out::println);
		String mergedString = strings3.stream().filter(string3 -> !string3.isEmpty()).
								collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		System.out.println("-----------------------------stats()----------------------");
		
		List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).
									 summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		System.out.println("----------------------Progra Ended------------------------");
		
	}

}
