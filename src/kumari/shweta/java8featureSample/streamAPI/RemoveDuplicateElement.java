package kumari.shweta.java8featureSample.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import kumari.shweta.interface1;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		Integer arr[] = {1,2,0,3,4,2,6,6};
		List<Integer> list= Arrays.asList(arr);
		System.out.println(list);
	List<Integer> disList=	list.stream().distinct().collect(Collectors.toList());
	System.out.println(disList);
		
		
		
	}
}
