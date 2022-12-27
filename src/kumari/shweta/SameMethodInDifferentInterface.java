package kumari.shweta;

public class SameMethodInDifferentInterface implements interface1 ,inetrface2{

	@Override
	public void displayOrganization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("heeeee");
		
	}
	
	public static void main(String[] args) {
	
		
		SameMethodInDifferentInterface obj= new SameMethodInDifferentInterface();
		obj.salary();//it will print value of default method Salary()
	}

}
