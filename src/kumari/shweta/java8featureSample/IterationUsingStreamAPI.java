package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/java-collection-stream-foreach

public class IterationUsingStreamAPI {
	
	public static void main(String[] args) {
		Employee E1 = new Employee("Shweta", 101,10000);
		Employee E2 = new Employee("Ragini", 102, 13000);
		Employee E3 = new Employee("hema", 10, 50000);
		
		List<Employee> list = new  ArrayList<Employee>();
		
		list.add(E1);
		list.add(E2);
		list.add(E3);
		List<Integer> idIntegers = new ArrayList<Integer>();
		
	//	list.stream().forEach(l->System.out.println("Employee id is "+l.getId()));
		
		//In parllel stream forEach -->Doesn't maintain order in sequential stream it maintains order
		
		list.stream().forEach(l->idIntegers.add(l.getId()));
		
		System.out.println(idIntegers);
		//In Parallel stream for thread -->Execute stream in multiple thread 
		
		//forEach --order not fixed but in forEachOrdered order is fixed 
		//In parllel stream forEachOrdered -->maintain order in sequential stream it maintains order
		list.parallelStream().forEachOrdered(l -> System.out.println("Employee name is "+l.getName()+"Salary is "+l.getSalary()));
		
	}

}
