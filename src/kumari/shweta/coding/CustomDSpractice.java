package kumari.shweta.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import kumari.shweta.interface1;


public class CustomDSpractice {
	
	HashMap<Integer,HashSet<Integer> > map1 ;
	HashMap<Integer, Integer> map2;
	Random random;
	
	public CustomDSpractice() {
		// TODO Auto-generated constructor stub
		map1= new HashMap<Integer, HashSet<Integer>>();
		map2=  new HashMap<Integer, Integer>();
		random = new Random();
	}
	
	public  boolean insert(int element) {
		int size = map2.size();
		map2.put(size + 1, element);
		if (map1.containsKey(element)) {
			map1.get(element).add(size + 1);
			return false;
		} else {
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(size + 1);
			map1.put(element, set);
			return true;
		}
	}
	
	public boolean remove(int element) {
     
		if(map1.containsKey(element)) {
		  HashSet<Integer> set = map1.get(element);
		  int toRemove= set.iterator().next();
		  //Two cases set store random value  so which value is first and which value is second 
		   set.remove(toRemove);
		  
		 if(toRemove==map2.size()) {
			 map2.remove(toRemove);
			 return true;
		 }
		 if(set.size()==0) {
				map1.remove(element);
		 }
		 int size=map2.size();
		 
		 
		  
		  
		}
		
	}
	
	public static void main(String[] args) {
		
	CustomDSpractice object= new CustomDSpractice();
	for(int i =0;i<5;i++) {
		
	boolean b=	object.insert(i);
	System.out.println(b);	
	}
	System.out.println(object.map1);
}
	
	

}
