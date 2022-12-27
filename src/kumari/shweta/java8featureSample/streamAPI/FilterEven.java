package kumari.shweta.java8featureSample.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import kumari.shweta.interface1;

public class FilterEven {
	
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> filterList = myList.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
	 int maxno=   filterList.stream().max((i,j)->i.compareTo(j)).get();
		
		System.out.println(filterList);
		System.out.println("Maximum no is"+maxno);
		
	}

}
