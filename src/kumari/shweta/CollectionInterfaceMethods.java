package kumari.shweta;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethods {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList();
		
		list.add("Shweta");
		list.add("archana");
		list.add("nickee");
		System.out.println(list);
		List<String> list2 = new ArrayList<String>();
		
		list2.add("Ragini");
		list2.add("Rajkumari");
		
		list.remove("Shweta");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list2.addAll(list);
		System.out.println(list2);
	System.out.println(list2.contains(list));	;
		list.clear();
		System.out.println("After clearing listis"+list);
		
		List list3= new ArrayList<String>();
		List list4 = new ArrayList<String>();
		list3.add("Shweta");
		//list4.add("Shweta");
		System.out.println(list3.equals(list4));
		list2.removeAll(list);
		System.out.println(list2);
		
		
	}

}
