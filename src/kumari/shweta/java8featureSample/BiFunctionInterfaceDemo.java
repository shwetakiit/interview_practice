package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.function.BiFunction;
class Employee1{
	
	int id;
	String name;
	public Employee1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class BiFunctionInterfaceDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		BiFunction<Integer,String,Employee1>  biFunction = (a,b)->new Employee1(a,b);
		
		list.add(biFunction.apply(100, "Shweta"));
		list.add(biFunction.apply(101, "Archana"));
		list.add(biFunction.apply(103, "Ragini"));
		
		list.stream().forEach(l->{
			
			System.out.println(l.name+"  "+l.id);
			
		});
	}

}
