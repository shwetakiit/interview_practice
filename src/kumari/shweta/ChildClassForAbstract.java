package kumari.shweta;

public class ChildClassForAbstract extends AbstractClassDemo {

	@Override
	protected void displayCompanyName() {
		// TODO Auto-generated method stub
		System.out.println("E2open");
	}

	@Override
	void bankname() {
		// TODO Auto-generated method stub
		System.out.println("Axis");
		
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("SHweta");
		
	}
	
	public static void main(String[] args) {
		AbstractClassDemo abstractClassDemo = new ChildClassForAbstract() ;
		
		abstractClassDemo.bankname();
		abstractClassDemo.displayCompanyName();
	//abstractClassDemo.commonAddress();  we can't access concrete method of Abstract Class
		
		interface1.print();
		
	
		
	}
	

}
