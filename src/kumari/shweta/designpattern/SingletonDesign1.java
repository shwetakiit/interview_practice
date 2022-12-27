package kumari.shweta.designpattern;

//Lazy intialization approach
public class SingletonDesign1 {

	//step1 
	private static  SingletonDesign1 obj=null;
	
	// step2 private constructor 
	private SingletonDesign1() {
		
	}
	
	//step3 
	public static SingletonDesign1 getInstance() {
		if(obj==null) {
			obj= new SingletonDesign1();
			}
		return obj;
	}
	public static void main(String[] args) {
		
		SingletonDesign1 objDesign1=SingletonDesign1.getInstance();
		System.out.println("Object objDesign1"+objDesign1.hashCode());
		SingletonDesign1 objDesign2=SingletonDesign1.getInstance();
		System.out.println("Object objDesign2"+objDesign2.hashCode());
		
	}
	
}
