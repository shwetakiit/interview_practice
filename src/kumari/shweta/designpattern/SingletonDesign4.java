package kumari.shweta.designpattern;
/*
Lazy intialization 
Double checked locking --thread safe
*/

public class SingletonDesign4 {
	
	public static volatile SingletonDesign4 obj = null;
	
	public static SingletonDesign4 getInstance() {
		if(obj==null) {
			synchronized (SingletonDesign4.class) {
				if(obj==null) {                        //Double check locking 
				obj = new SingletonDesign4();
				}
			}
			
		}
		return obj;
	}

}
