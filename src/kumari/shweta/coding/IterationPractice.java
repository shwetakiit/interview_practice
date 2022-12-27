package kumari.shweta.coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import kumari.shweta.interface1;

public class IterationPractice {
	
	public static void main(String[] args) {
		
		Collection<Integer> listCollection = new  ArrayList<Integer>();
	/*	for(int i =0;i<5;i++) {
			
			listCollection.add(11);
		}
		System.out.println(listCollection);
		*/
		
		Boolean boolean1 =null;
		 boolean b=false;
		 boolean1 = b;
		 
		 
		 Comparator<Integer> comparator=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		 String k =( boolean1==null )? "isAssignLotsToPO is null" :boolean1.booleanValue()?"Yes":"No";
		 System.out.println(k);
	/*	if(boolean1.booleanValue()!=null?boolean1.booleanValue():) {
			System.out.println("Correct code ");
		} else {
			System.out.println("Incorrect code");
		}*/
		
		
		/*Iterator itr = listCollection.iterator();
		while(itr.hasNext()) {
		System.out.println("hello"+itr.next());
		} */
		
		
		if(listCollection.isEmpty() || listCollection==null )
		{
			System.out.println("hello");
		}
		//	
	//	System.out.println("Hellow"+ listCollection.iterator().next());
	/*	for(Integer collection :listCollection) {
			
			System.out.println("using for each "+collection);
		} */
		
		System.out.println("Is empty"+listCollection.isEmpty());
		

		
	}

}
