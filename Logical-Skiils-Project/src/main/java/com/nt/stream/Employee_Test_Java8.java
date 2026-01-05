package com.nt.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee_Test_Java8 {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "M"
				+ "anu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		  // List<Employee>  desendingOrderListBySalary  = employeeList.stream().sorted((o1,o2)-> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		 List<Employee>  desendingOrderListBySalary  = employeeList.stream().sorted((o1,o2)-> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		   System.err.println("desendingOrderListBySalary == ");
		   desendingOrderListBySalary.forEach(System.out::println);
		   
		   List<Employee> secondHighestSal = employeeList.stream().sorted( (o1,o2) -> (int)(o2.getSalary() - o1.getSalary())).skip(1).collect(Collectors.toList());
            System.err.println("Line 45 SecondHighest Sal "+secondHighestSal);
		   
		   List<Employee>  threehighestSalaryEmployeeList  = employeeList.stream().sorted((o1,o2)-> (int)(o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
		   System.err.println("threehighestSalaryEmployeeList == ");
		   threehighestSalaryEmployeeList.forEach(System.out::println);
		   List<Employee>  skipthreehighestSalaryEmployeeList  = employeeList.stream().sorted((o1,o2)-> (int)(o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
		   System.err.println("skipthreehighestSalaryEmployeeList == ");
		   skipthreehighestSalaryEmployeeList.forEach(System.out::println);
		   System.err.println("Fetch employee list whose starts with name 'A' == ");
		   employeeList.stream().filter(s->s.getName().startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
		   System.err.println("*************************************");
		     //Salary More than 30000.0
			employeeList.stream().filter(i -> i.getSalary() >= 30000.0).collect(Collectors.toList()).forEach(System.out::println);
		   System.out.println("-------------------------------------------------------------------------------");
		   // fetch MALE records
			//employeeList.stream().filter(i -> i.getGender() == "Male").collect(Collectors.toList()).forEach(System.out::println);
		   Map<String, Long> i= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		    System.out.println(i);
		    System.out.println("-------------------------------------------------------------------------------");   
		     //all departments
		     employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		   //Alternative way
		     //  Set<String> collect = employeeList.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
		   //  System.out.println(collect);
		     System.out.println("-------------------------------------------------------------------------------");
		     // average age of male and female employees
		     Map<String, Double> avgAgeOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			System.out.println("avgAgeOfMaleAndFemale ="+avgAgeOfMaleAndFemale);
			 System.out.println("-------------------------------------------------------------------------------");
			//highest paid employee in the organization?
			Optional<Employee> opt = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
			Employee emp = opt.get();
			System.out.println("highest paid employee in the organization? "+emp);
			Employee employee = employeeList.stream().max((e1,e2)-> e1.getSalary() > e2.getSalary() ? 1 : -1).get();
			System.out.println("highest paid employee in the organization 2nd way? "+emp);

			//lowest paid employee in the organization?
			Optional<Employee> opt1 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
			Employee employee2 = opt1.get();
			System.out.println("lowest paid employee in the organization? "+employee2);
			Employee employee3 = employeeList.stream().min((e1,e2)->e2.getSalary()<e1.getSalary() ? 1 :-1).get();
			System.out.println("lowest paid employee in the organization 2nd way? "+employee3);
			
			System.out.println("-------------------------------------------------------------------------------");
			//all employees who have joined after 2015?
			System.out.println("all employees who have joined after 2015");
			employeeList.stream().filter(m -> m.getYearOfJoining()> 2015).map(Employee::getName).forEach(System.out::println);
			System.out.println("-------------------------------------------------------------------------------");
			
			//ListIterate.distinct(employeeList,HashingStartegies.fromInFunction(Employee::getName));
			//NEED TO TEST
			
			//Count the number of employees in each department?
			Map<String, Long> employeeCountByDepartment = employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

			Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

			for (Entry<String, Long> entry : entrySet) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}

			
			//average salary of each department?
			Map<String, Double> avgSalaryOfDepartments=
					employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));       
					Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();
					for (Entry<String, Double> entry : entrySet1) 
					{
					    System.out.println(entry.getKey()+" : "+entry.getValue());
					}
			
			//Get the details of youngest male employee in the product development department?

			Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
					.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
					.min(Comparator.comparingInt(Employee::getAge));

			Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

			System.out.println("Details Of Youngest Male Employee In Product Development");

			System.out.println("----------------------------------------------");

			System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

			System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

			System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

			System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

			System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());
			
			
			//Who has the most working experience in the organization?
			Optional<Employee> seniorMostEmployeeWrapper=
					employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
					         
					Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
					         
					System.out.println("Senior Most Employee Details :");
							
					System.out.println("----------------------------");
					         
					System.out.println("ID : "+seniorMostEmployee.getId());
					         
					System.out.println("Name : "+seniorMostEmployee.getName());
					         
					System.out.println("Age : "+seniorMostEmployee.getAge());
					         
					System.out.println("Gender : "+seniorMostEmployee.getGender());
					         
					System.out.println("Age : "+seniorMostEmployee.getDepartment());
					         
					System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());
					         
					System.out.println("Salary : "+seniorMostEmployee.getSalary());
					
					
					// How many male and female employees are there in the sales and marketing team?
					Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
							.filter(e -> e.getDepartment() == "Sales And Marketing")
							.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

					System.out.println(countMaleFemaleEmployeesInSalesMarketing);
					
					// What is the average salary of male and female employees?

					Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream().collect(
							Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

					System.out.println(avgSalaryOfMaleAndFemaleEmployees);
					
					//List down the names of all employees in each department?
					Map<String, List<Employee>> employeeListByDepartment=
							employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
							         
							Set<Entry<String, List<Employee>>> entrySet2 = employeeListByDepartment.entrySet();
							         
							for (Entry<String, List<Employee>> entry : entrySet2) 
							{
							    System.out.println("--------------------------------------");
							             
							    System.out.println("Employees In "+entry.getKey() + " : ");
							             
							    System.out.println("--------------------------------------");
							             
							    List<Employee> list = entry.getValue();
							             
							    for (Employee e : list) 
							    {
							        System.out.println(e.getName());
							    }
							}
							
						//	What is the average salary and total salary of the whole organization?		
							DoubleSummaryStatistics employeeSalaryStatistics=
									employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
									         
									System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
									         
									System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
									
						//Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.			

						Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
								.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

						Set<Entry<Boolean, List<Employee>>> entrySet3 = partitionEmployeesByAge.entrySet();

						for (Entry<Boolean, List<Employee>> entry : entrySet3) {
							System.out.println("----------------------------");

							if (entry.getKey()) {
								System.out.println("Employees older than 25 years :");
							} else {
								System.out.println("Employees younger than or equal to 25 years :");
							}

							System.out.println("----------------------------");

							List<Employee> list = entry.getValue();

							for (Employee e : list) {
								System.out.println(e.getName());
							}
						}
			//Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
						Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
				         
						Employee oldestEmployee = oldestEmployeeWrapper.get();
						         
						System.out.println("Name : "+oldestEmployee.getName());
						         
						System.out.println("Age : "+oldestEmployee.getAge());
						         
						System.out.println("Department : "+oldestEmployee.getDepartment());
						System.out.println("----------------------------");

		//Based on deptName fetch list of Employee names		
						Map<String, List<String>> deptNameListOfEmpNames = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee :: getName, Collectors.toList())));				
						System.out.println("List of Employee Name based on dept Name "+deptNameListOfEmpNames);
							
						
		//employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee :: getSalary));
					//  Map<String, List<Employee>> collect = employeeList.stream()   .collect(Collectors.groupingBy(Employee :: getDepartment));
					// System.err.println("123 "+collect);
			//			double average = summaryStatistics.getAverage(); System.out.println(average);
			//			double sum = summaryStatistics.getSum();System.out.println(sum);
				    	
				OptionalInt maxAge = employeeList.stream().mapToInt(e->e.getAge()).max();
				System.out.println("Maximum Age ="+maxAge);
	            List<Employee> itList = employeeList.stream().filter(p->p.getDepartment().equals("HR")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	            // itList.forEach(System.out::println);
	            System.out.println(itList);
	            itList.forEach(System.out::println);
	            
	            // Find the max age of Employee 
	            employeeList.stream().mapToInt(o->o.getAge()).max().ifPresent(System.out::println);;
	            Optional<Employee> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee :: getAge)));         
	            System.out.println("MAxiumum age alternative way ="+optional.get());

	            Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee :: getAge));
	         System.out.println("Max Age : "+max.get());
	            //  employeeList.stream().collect(Collections.groupingBy(Comparator.comparing(Employee :: getAge)));
	            
	            //fetch emp  names only
	            List<String> empNames = employeeList.stream().map(x->x.getName()).collect(Collectors.toList());
	            System.out.print("Emp Name list:: "+empNames+" ");System.out.println();
	            
	            List<String> deptlist = employeeList.stream().map(x->x.getDepartment()).distinct().collect(Collectors.toList());
	            System.out.println("Department List = "+deptlist);
	            
	            //26-06-2025
	           // employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, i-> i.getName().collect(Collectors.toList())));
	            Map<String, List<String>> deptWiseEmpNames = employeeList.stream()
	                        .collect(Collectors.groupingBy(
	                        		Employee :: getDepartment,
	                        		Collectors.mapping(Employee :: getName, Collectors.toList())));    
	           
	            System.out.println("**************************Department wise emp name ****************");
	
	            deptNameListOfEmpNames.forEach( (dept,name) -> {
	            	System.out.println(dept+" : "+name);
	            });
	
	List<String> nameListGreaterThan20K = employeeList.stream().filter(m -> m.getSalary() > 20000)
	                     .map(Employee :: getName).collect(Collectors.toList());
	System.out.println("nameListGreaterThan20K "+nameListGreaterThan20K);
	
	//To sort employees by salary in descending order and then by employee name (ename) in ascending order using Java 8 Stream API,
	 List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()
			                     .thenComparing(Employee :: getName))
	                             .collect(Collectors.toList());
	System.out.println("sorted employees by salary in descending order and then by employee name");
	
	sortedEmployees.forEach(System.out::println);
	

	}//main

}//class


class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}

}