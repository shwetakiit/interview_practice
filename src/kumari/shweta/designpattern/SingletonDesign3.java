package kumari.shweta.designpattern;
//Eager intialization approach

public class SingletonDesign3 {
	
	private static SingletonDesign3 obj = new SingletonDesign3();
	
	private SingletonDesign3() {
		
	}
	
	public static SingletonDesign3 getInstance() {
		return obj;
		
	}
	public static void main(String[] args) {
		SingletonDesign3 singletonDesign3 = SingletonDesign3.getInstance();
		System.out.println(singletonDesign3);
	}

}
