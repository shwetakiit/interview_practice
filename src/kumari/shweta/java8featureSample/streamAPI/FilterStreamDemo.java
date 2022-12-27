package kumari.shweta.java8featureSample.streamAPI;


import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;




public class FilterStreamDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list1= new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.stream().forEach(l->list1.add(l));
		List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        long countvalue = list .parallelStream().count();
		System.out.println("even number list is "+list2);
		
		System.out.println("List count is "+countvalue);
		System.out.println("Value of list1 is"+list1);
	}

}
