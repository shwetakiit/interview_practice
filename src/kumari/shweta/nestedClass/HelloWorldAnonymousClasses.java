package kumari.shweta.nestedClass;

import kumari.shweta.interface1;

public class HelloWorldAnonymousClasses {
	
	interface HelloWorld  {
		
		public void greet();
		public void greetSomeone();
		
	}
	
	public HelloWorld  sayHello() {
		//Would annonymous concept we are implementing helloword in another class EnglishGreeting
		class EnglishGreeting implements  HelloWorld {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Good Morning HellowWord Normal");
				
			}

			@Override
			public void greetSomeone() {
				// TODO Auto-generated method stub
				System.out.println("Good Morning HellowWord Normal : greetSomeone");
				
			}
			
		}
		HelloWorld objHelloWorld= new EnglishGreeting();
		return objHelloWorld;
		
	}

}
