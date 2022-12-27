package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kumari.shweta.interface1;

public class MergeOneListInOtherList {
	
	public static void main(String[] args) {
		
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	
	for(int i =1;i<=5;i++) {
		list1.add(i);
	}
	
	for(int i=10;i<=15;i++) {
		list2.add(i);
		
	}
	
	List<Integer> list3= Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	
	System.out.println(list3);
		
		
	}

}
