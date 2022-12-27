package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*class SortById implements Comparator<Employee> {  //Normal approach
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.id<o2.id)?-1:(o1.id>o2.id)?1:0;
	}
}*/

public class SortEmployeebyIdUsingLambda {
	public static void main(String[] args) {
		Employee e1 = new Employee("Shweta", 102,100000);
		Employee e2 = new Employee("Ragini",100,50000);
		Employee e3 = new Employee("Gopal", 99,0);
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
//	Collections.sort(list,new SortById());
		
	Comparator<Employee> comparator = (O1,O2)->(O1.id<O2.id)?-1:(O1.id>O2.id)?1:0;
	
	Collections.sort(list, comparator);
	
	System.out.println(list);
	
	//Sort by name using lambda expression 
	Collections.sort(list,(obj1,obj2)->(obj1.name.compareTo(obj2.name)));
	System.out.println(list);
	list.stream().forEach(l->System.out.println(l));
	//inplace of lambda expression we are using method reference i.e :: double colon
   list.stream().forEach(System.out::println);
		
		
	}

}
