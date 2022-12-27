package kumari.shweta.nestedClass;


import kumari.shweta.interface1;

public class OuterClass {
	
	private int x=10;
	private static int y=20;
	private final int  z=30;
	
	class InnerClass{
	
		public void display() {
			//We cant reintialzed final variable getting error
			//z=40;
			
			//Recdeclaration will work 
			int z=50;
			System.out.println("Inner class display method");
			System.out.println("value of x"+x+"Value of y"+y+"value of z"+z);
		}
	}
	
	static class StaticInnerClass{
		
		public void staticDisplay(OuterClass obj) {
			System.out.println("Static variable of outer classs"+y);
			
			//Directly we cant access outer class static method need to create object of outer class
			//System.out.println("Instance variable of outer class"+x);
			System.out.println("Instance variable of outer class"+obj.x);
		}
	}
	

}
