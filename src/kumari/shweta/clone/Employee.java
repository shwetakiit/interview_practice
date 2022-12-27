package kumari.shweta.clone;
//Preventing cloning in singleton desing
//https://codepumpkin.com/preventing-cloning-in-singleton-design-pattern/
public class Employee  implements Cloneable{
	
	private int employeeId;
	private String name;
	private Department department;
	
	public Employee(int employeeId, String name, Department department) {
		
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() throws CloneNotSupportedException {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
//Cloning here 
protected Object clone() throws CloneNotSupportedException {
  /// return super.clone();
	
	//Override the clone method in customized way to overcome the original copy changed due to Department object 
   Employee clone = (Employee) super.clone();
   clone.department=(Department) department.clone();
   return clone;

}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + "]";
}


	
	

}
