package kumari.shweta.inhertance;

public class DerivedClass extends BaseClass{
	
	public void Display() {
		System.out.println("non static method can't override Static method of parent class");
	}
	
	public static void print() {
		System.out.println("Static of derived class can't hide by instance method of parent class");
	}

}
