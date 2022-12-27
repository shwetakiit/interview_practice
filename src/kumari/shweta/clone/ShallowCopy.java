package kumari.shweta.clone;

import kumari.shweta.interface1;

public class ShallowCopy {
	int i ;
	int j;
	public static void main(String[] args) {
		ShallowCopy obj1= new ShallowCopy();
		obj1.i=10;
		obj1.j=20;
		ShallowCopy obj2= obj1; //Sahllow copy v
		System.out.println("obj1 "+obj1.i+" "+obj1.j);
		System.out.println("obj2 "+obj2.i+" "+obj2.j);
		obj2.j=100;
		System.out.println("obj1"+obj1.i+" "+obj1.j);
		System.out.println("obj2"+obj2.i+" "+obj2.j); 
		
		//J value of object1 and object2 changes
		
		
		
		
	}

}
