package kumari.shweta.coding;

import java.util.HashMap;
import java.util.Map;

class EmployeeTest{
	
	String name;
	double salary;
	public EmployeeTest(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	
}




public class Test {
	
	public static void main(String[] args) {
		EmployeeTest emp1 = new EmployeeTest("Ragini", 50000);
				EmployeeTest emp2 = new EmployeeTest("Archana", 100000);
				
		 EmployeeTest emp3 = new EmployeeTest("Astha", 8000);
		Map<Integer, EmployeeTest> map = new HashMap();
		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		
		for(Integer k : map.keySet()) {
			
			EmployeeTest obj = map.get(k);
			if(obj.salary>10000) {
				System.out.println("Key"+k+ " "+obj.name+" "+obj.salary);
			}
		}
	
		map.forEach((key,value)->{
			EmployeeTest obj1 = map.get(key);
			if(obj1.salary>10000) {
				System.out.println(key+" "+obj1.name+" "+obj1.salary);
			}
		)
		};

	}

}
