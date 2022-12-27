package kumari.shweta.clone;
public class Department implements Cloneable{
	private String name;
	public Department(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
