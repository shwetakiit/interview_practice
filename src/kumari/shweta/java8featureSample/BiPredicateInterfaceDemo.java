package kumari.shweta.java8featureSample;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceDemo {
	
	public static void main(String[] args) {
		
		
		BiPredicate<Integer, Integer> biPredicate = (a,b)->(a+b)%2==0;
		System.out.println("Is even? "+biPredicate.test(10, 20) );
	}

}
