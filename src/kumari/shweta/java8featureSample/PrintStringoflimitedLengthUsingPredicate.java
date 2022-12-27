package kumari.shweta.java8featureSample;

import java.util.function.Predicate;

public class PrintStringoflimitedLengthUsingPredicate {
	
	public static void main(String[] args) {
		
		String[] strings = {"Nag","Chiranjeevi","Venkatesth","Baliah","Katrina"};
		Predicate<String> strLength = s->s.length()>5;
		for(String s:strings ) {
			
			if(strLength.test(s)) {
				System.out.println(s);
			}
			
		}
	}

}
