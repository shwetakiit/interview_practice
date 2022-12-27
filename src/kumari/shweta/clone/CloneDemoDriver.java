package kumari.shweta.clone;
public class CloneDemoDriver {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Department department = new Department("R&D department");
		Employee employee = new Employee(100, "Shweta", department);
		System.out.println(employee);
		
		Employee clonEmployee =(Employee) employee.clone();
		//Clone object data 
		System.out.println("Cloned copy data ----");
		System.out.println(employee);
		
		/* with below approach It will change original copy of department object 
         so original employee object departmenet name will get change 
         So overcome this problem we need to override clone method in Department class as well
         and need to override clone method in customized way 
         */
		
		
		Department department2= clonEmployee.getDepartment();
		department2.setName("PS department"); 
		clonEmployee.setEmployeeId(101);
		clonEmployee.setName("Deepti");
		clonEmployee.setDepartment(department2);
		System.out.println("After changing field value of cloned Copy and original object value is ---\n \n");
		System.out.println("Cloned copy"+clonEmployee);
		System.out.println("Original copy"+employee);
		
		//After overriding clone method in Department 
		System.out.println("Hashcode of original object  "+employee.hashCode());
		System.out.println("Hashcode of cloned object  "+clonEmployee.hashCode());
		
		//Cloning Condition as per JDK rule 
		//1st condition :Must be true and objects must have different memory addresses
		System.out.println(employee!=clonEmployee);
		
		//2nd condition as we are returning same class so both original and copied object 
		//should have same class name 
		
		System.out.println(employee.getClass()==clonEmployee.getClass());
		System.out.println("Original object Class name is "+employee.getClass());
		System.out.println("Copied object Class name is "+clonEmployee.getClass());
/*
 * 3rd condition -Default equals method with original object and copied object
 * is false due to address comparision but logically it should be true becoz its
 *  copied taken from copied of originalfor that we need to override equals method
 *  
*/
		
		System.out.println(employee.equals(clonEmployee));
	}

}
