package com.nt.stream;

import java.util.Arrays;
import java.util.List;

public class Person_Test {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);

		double avgAge = persons.stream().mapToInt(Person :: getAge).average().orElse(0);
		
		System.out.println("Average age of Person : "+avgAge);
	}

}

class Person {
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
	
	
}