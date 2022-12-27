package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Employee2 {
	String name;
	double salary;
	public Employee2(String name, double i) {
		
		this.name = name;
		this.salary = i;
	}	
}

public class BiConsumerInterfaceDemo {
	
 public static void populate(ArrayList<Employee2> l) {
    	 
    	 l.add(new Employee2("Durga", 10000));
    	 l.add(new Employee2("Shweta", 70000));
    	 l.add(new Employee2("Ragini",90000));
    	 l.add(new Employee2("Astha", 0));
    }
	public static void main(String[] args) {
		
		ArrayList<Employee2> list = new ArrayList<Employee2>();
		list.add(new Employee2("Durga", 10000));
		list.add(new Employee2("Shweta", 70000));
		list.add(new Employee2("Ragini",90000));
		list.add(new Employee2("Astha", 0));
	    BiConsumer<Employee2, Double> biConsumer = (e,d)->e.salary=e.salary+d;
	   
     list.stream().forEach(l-> biConsumer.accept(l, (double) 500));
	 list.stream().forEach(l->System.out.println(l.name+" "+l.salary) );
    
		
	}



}
