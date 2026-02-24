package com.nt.coderbyte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItineraryFinder {

	public static void main(String[] args) {
		Map<String, String> tickets = new HashMap<>();
		tickets.put("Bombay", "Delhi");
		tickets.put("Chennai", "Banglore");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		printItinerary(tickets);
		
	//	List<Integer> list  = Arrays.asList(1,2,2,3,4,4,5,5);
		Map<Integer, Integer>  numbers = new HashMap<>();
		numbers.put(1, 2);
		numbers.put(4, 5);
		numbers.put(3, 4);
		numbers.put(2, 3);
		Set<Integer> res = new HashSet<>(numbers.keySet());
       System.out.println(res);
	}

	public static void printItinerary(Map<String, String> tickets) {
		// Step 1: Finding starting city
		Set<String> destinations = new HashSet<>(tickets.values());
		// System.out.println(destinations);

		String start = null;
		for (String src : tickets.keySet()) {
			if (!destinations.contains(src)) {
				start = src;
				break;
			}
		} // for

		// Step 2: Print the Journey
		while (start != null && tickets.containsKey(start)) {
			String next = tickets.get(start);
			System.out.print(start + " ->" + next + " ");
			start = next;
		}
	}

}
