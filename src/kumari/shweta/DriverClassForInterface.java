package kumari.shweta;

public class DriverClassForInterface {
	
	public static void main(String[] args) {
		
		ImplementationOfInterface obj = new ImplementationOfInterface();
		System.out.println("Default method of Interface");
		obj.salary();
		
		obj.displayName();
		obj.displayOrganization();
		obj.displayDesignation();
		System.out.println(obj.string);
		System.out.println(InterfaceDemo.string);
		interface1.print();
		
	}

}
