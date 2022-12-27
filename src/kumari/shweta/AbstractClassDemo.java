package kumari.shweta;

public abstract class AbstractClassDemo {
	
	private String name; 
	
	
	
	
	//private abstract String nameString; illegal 
	//abstract keywork only we use with method and class 
	//abstract method modifier can be public protected and default but not private 
	
	
	public AbstractClassDemo(String name) {
		
		this.name = name;
		System.out.println("I am under parameterized constructor of Abastract class ");
	}

	
	public AbstractClassDemo() {
		
		// TODO Auto-generated constructor stub
		System.out.println("I am under default constructor of AbstractClass");
	}


	protected abstract void displayCompanyName(); //It will work 

	 abstract void bankname(); //it will work 
	public abstract void displayName();
	private void commonAddress() {
		System.out.println("Prestiage lake ridge");
	}
	

	
	//private abstract void password(); we can't make abstract method priavte becoz we have to 
	//defined that method in subclass so here error will be thrown

}
