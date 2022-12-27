package kumari.shweta.java8featureSample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
class customeEmployeeSort implements Comparator<Employee>{
	
    @Override
	public int compare(Employee o1, Employee o2) {
		
	if(o1.salary>o2.salary) return +1;
	else if(o1.salary<o2.salary)return -1;
	else return 0;
	
	}
	
	
}

public class MethodRefereneDemo {
	
	
	
public static void main(String[] args) {
		
List<String > wordList=Arrays.asList("shweta","kumari","singh","buxar");

//Iterate using lambda expression
		

wordList.forEach(l->StrngUtils.Capetialized(l));

//Static methods reference
wordList.forEach(StrngUtils::Capetialized);


//Instance method reference of particular objects

List<Employee> employees= Arrays.asList(new Employee("Ragini", 101, 50000),
	                             new Employee("Shweta ", 102, 80000),
	                             new Employee("Archana", 103, 200000),
	                             new Employee("Richa", 106, 20000));

//Method reference of constructor 

Comparator<Employee> c=new customeEmployeeSort();



//Instance method reference of particular objects
List<Employee> sortedEmployee= employees.stream().sorted(c::compare).collect(Collectors.toList());
System.out.println(sortedEmployee);

//Instance method reference of particular objects for particular  type

List<Integer> list= Arrays.asList(10,4,3,5);
List<Integer> sortList=list.stream().sorted(Integer::compareTo).collect(Collectors.toList());
System.out.println("Sorted Integer list is"+sortList);



		
	}

}
