package kumari.shweta.inhertance;

public class MultipleInheritance implements C {

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("C");
		
	}

	@Override
	public void printA() {
	System.out.println("A");		
	}

	@Override
	public void printB() {
		System.out.println("B");
		
	}

	@Override
	public void Display() {
		System.out.println("Whether I am from A or From B ??? Two resolve this conflict java doesn't support multiple inheritance");
		
	}


}
