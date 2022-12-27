package kumari.shweta.clone;
public class CopyConstructor {
	
	private int Id;
	private String name;
	private Department department;
	
	public CopyConstructor(int id, String name, Department department) {
	
		Id = id;
		this.name = name;
		this.department = department;
	}
	public CopyConstructor(CopyConstructor constructor) {
		this.Id = constructor.Id;
		this.name = constructor.name;
		this.department =constructor.department;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "CopyConstructor [Id=" + Id + ", name=" + name + ", department=" + department + "]";
	}	
	
	

}
