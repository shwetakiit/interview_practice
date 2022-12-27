package kumari.shweta.designpattern;

//Singleton class with threadsafe 
//Lazy intialization approach

public class SingletonDesign2 {
	
	private static SingletonDesign2  obj = null;
    private SingletonDesign2() {
    	
    }
    
    public static synchronized SingletonDesign2  getInstance() {
    	if(obj==null) {
    		obj= new  SingletonDesign2();
    	}
    	return obj;
    }
    public static void main(String[] args) {
    	SingletonDesign2 obj1 = SingletonDesign2.getInstance();
    	SingletonDesign2 obj2= SingletonDesign2.getInstance();
    	System.out.println("object obj1 "+obj1);
    	System.out.println("object obj2 "+obj2);
    	
	}

}
