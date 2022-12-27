package kumari.shweta.inhertance;

public class MultipleInheritanceC implements A,B {

	@Override
	public void printB() {
	System.out.println("B");
		
	}

	@Override
	public void printA() {
	System.out.println("A");
		
	}

	@Override
	public void Display() {
	System.out.println("Whether I am from A or From B ??? Two resolve this conflict java doesn't support multiple inheritance");
		
	}
	

}
