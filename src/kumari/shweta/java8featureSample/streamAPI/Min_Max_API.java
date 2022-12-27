package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.Optional;

import kumari.shweta.interface1;

public class Min_Max_API {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		//list.add(0);
		list.add(5);
		list.add(20);
		list.add(100);
		list.add(10);
		System.out.println(list);
		
		Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value is "+max);
		Optional<Integer> optional = list.stream().min((i1,i2)->i1.compareTo(i2));
		System.out.println("Minimum value is "+optional.get());
		
	}

}
