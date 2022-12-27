package kumari.shweta.java8featureSample;
interface Interf {
	
	
	public static int sum (int a, int b ) {
		return a+b;
	}
	
	default void displayName() {
		
		System.out.println("Shweta");
	}
	default void Address() {
		System.out.println("Buxar");
	}
}

class ImplementedInterface implements Interf{
	
	
}

public class StaticMethodInInterface implements  Interf{
	
	public static void main(String[] args) {
	int sum=	Interf.sum(2, 3);
	System.out.println("value of sum is "+sum);
	
//	int sum1=sum(11,11); erro// sum() is not of StaticMethodInInterface ask for create this method
	//int sum2= StaticMethodInInterface.sum(22,22); error

	StaticMethodInInterface obj= new StaticMethodInInterface();
	//int sum3=obj.sum(20,20);//error for creating sum method
	//System.out.println("value of sum3 is "+sum3);
	
	
	
	Interf objInterf= new ImplementedInterface();
	objInterf.displayName();
	objInterf.Address();
	
	
	}

}
