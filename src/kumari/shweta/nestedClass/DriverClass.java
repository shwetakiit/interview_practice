package kumari.shweta.nestedClass;



import kumari.shweta.interface1;
import kumari.shweta.nestedClass.OuterClass.StaticInnerClass;

public class DriverClass {
	
	
	
	public static void main(String[] args) {
		
		int x=10;
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.display();
		
	
		//For static inner class concept no need to create object of outer class 
		
		OuterClass outerClass = new OuterClass();
		StaticInnerClass obj = new StaticInnerClass(); 
		obj.staticDisplay(outerClass);
		//We cant call staticDiaplay method using only Staticinnerclass //
		
	//Normal approach without using annoynmous innerclass concept
	
		HelloWorldAnonymousClasses objAnonymousClasses = new HelloWorldAnonymousClasses();
		
		objAnonymousClasses.sayHello().greet();
		
		//Annonymous inner class concept for implementing interface
		HelloWorld objHelloWorld= new HelloWorld() {
			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Greeting form annonymous classof interface ");
				System.out.println("Annonymous class have access of member of enclosing class"+x);
				
			}
		};
		objHelloWorld.greet();
		
	}

}
