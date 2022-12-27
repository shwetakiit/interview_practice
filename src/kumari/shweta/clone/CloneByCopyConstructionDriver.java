package kumari.shweta.clone;
public class CloneByCopyConstructionDriver {
	public static void main(String[] args) throws CloneNotSupportedException {
		
Department department=new Department("R&D department");		
CopyConstructor obj = new CopyConstructor(101, "Shweta",department);
CopyConstructor cloneObj = new CopyConstructor(obj);

System.out.println("Original copy "+obj);
System.out.println("Cloned copy"+cloneObj);
System.out.println("After changing field value of cloned object ");

 Department department2= (Department) obj.getDepartment().clone();
 department2.setName("PS TEAM");
 
cloneObj.setId(999);
cloneObj.setName("PS team");
cloneObj.setDepartment(department2);

System.out.println("Original copy "+obj);
System.out.println("Cloned copy"+cloneObj);
		
	}

}
