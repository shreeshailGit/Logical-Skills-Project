package com.nt.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

;

public class HashMap_Test {

	public static void main(String[] args) {
		HashMap<Employee,Integer> map = new HashMap<>();
		
		Employee e1 = new Employee(101, "Jack", 30);
		Employee e2 = new Employee(101, "Jack", 30);
		map.put(e1, 230);
		map.put(e2, 400);
		System.out.println(map.size());
		
		HashSet<Employee> set = new HashSet<>();
		set.add(e1);set.add(e2);
		System.out.println(set.size());
		
		List<String> strs = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		System.out.println(groupedAnagrams(strs));
	}
	
	public static List<List<String>> groupedAnagrams(List<String> lists){
		Map<String,List<String>> map = new HashMap<>();
		
		for(String word : lists) {
			 char[] ch = word.toCharArray();
			 Arrays.sort(ch);
			 String sorted = new String(ch);
			 map.computeIfAbsent(sorted, k->new ArrayList<>()).add(sorted);
		}
		
		return new ArrayList<>(map.values());	
	}

}
class Employee {

	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}