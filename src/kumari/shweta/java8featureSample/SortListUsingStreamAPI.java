package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class SortListUsingStreamAPI {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		list.add("orange");
		//Sort using stream 
		List<String > list2= list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("Natural order"+list2);
		List<String> revList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reversed List is "+revList);
		list2.forEach(i->System.out.println(i));
		
		
		//Sort using Stream and lemba 
		
		List<String > list3 = list.stream() .sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		list3.forEach(i->System.out.println(i));
		
		//Sort Employee by salary 
		
		ArrayList<Employee>  listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(new Employee("Shweta", 101, 62000));
		listOfEmployees.add(new Employee("RAGINI", 102, 52000));
		listOfEmployees.add(new Employee("Bickee", 104, 200000));
		listOfEmployees.add(new Employee("HSSGFDSG", 101, 61000));
		
		List<Employee> sortedListEmployees= listOfEmployees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		System.out.println(sortedListEmployees);
		List<Employee> sordinDecending = listOfEmployees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		
		System.out.println("List is "+sordinDecending);
	}

}
