package kumari.shweta.java8featureSample;

import java.util.function.Function;
import java.util.function.Predicate;


import kumari.shweta.interface1;

public class Test1 {
	
	
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i ->i *i;
		System.out.println("Square is "+f.apply(10));
		System.out.println("Square is "+f.apply(5));
		//Check even odd number by using Predicate 
		
		Predicate<Integer> predicate = i->i%2==0;
		System.out.println("IS number even"+predicate.test(5));
		System.out.println("IS number even"+predicate.test(4));
		
	}

}
