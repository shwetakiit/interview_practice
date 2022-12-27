package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import kumari.shweta.interface1;

public class MapStreamDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(100);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(30);
		
		List<Integer> list2 = list.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("List after adding 5 in each data"+list2);
		
		//toSet Implementation
		//distinct data 
		java.util.Set<Integer>  set = list.stream().collect(Collectors.toSet());
		System.out.println("Set value is "+set);
		
		//toMap Implementation

		
		
		
		//Count() method 
		//Count no of student who has marks less than equal to 30 
		long count = list.stream().filter(i->i<=30).count();
		
		System.out.println("less than equal to count is "+count);
		
		//Sort list using is stream() API 
		List<Integer> list3 = list .stream().sorted().collect(Collectors.toList());
		System.out.println("Natural sorting is "+list3);
		//choose distinct element 
		List<Integer> list5 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Disticnt list is "+list5);
		

		
		//Sorting in descending order using customize sorting 
		
List<Integer> list4 = list .stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
System.out.println("soring in descending order"+list4);

		
		
		
		
	}

}
