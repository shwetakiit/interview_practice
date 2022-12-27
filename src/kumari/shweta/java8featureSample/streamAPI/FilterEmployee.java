package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


 class Employee {
	String name;
	int id;
	int age;
	String city;
	
	public Employee(String name, int id,int age,String city) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.city=city;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", city=" + city + "]";
	}


}
	
public class FilterEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Shweta", 1,25,"Bangalore");
		Employee e2 = new Employee("Bickee", 2,27,"Bangalore");
		Employee e3 = new Employee("Ragini", 3, 20,"Bhubaneswar");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
	//	List<Employee> list1 = list.stream().filter(emp->emp.age<=20).collect(Collectors.toList());
		List<Employee> list1 = list.stream().filter(emp->emp.age<=20 ).collect(Collectors.toList());
		System.out.println(list1);
		
		//Group by use of Stream API --group by same city
		
		Map<String,List<Employee>> groupbycity= list.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(groupbycity);
		
		
	}
	
}

