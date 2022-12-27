package kumari.shweta.java8featureSample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;



import kumari.shweta.interface1;

public class StreamApi {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays .asList(1,2,3,4,5,6);
		
		int result=0;

		for(int i : values ) {
			
			result=result+2*i;
		}
		System.out.println("value of result is "+result);
		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)-> c+e));
		//Above step how it works in backgroup
		Function<Integer,Integer> f = new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}
			
		};
		BinaryOperator<Integer> binaryOperator= new BinaryOperator<Integer>() {
			int result1=0;
			public Integer apply(Integer i,Integer j) {
				result1=result1+i;
				return result1;
			}
		};
		
		
	//Stores the unique element in Array using Stream API :
		List<Integer> list1= Arrays.asList(1,2,2,1,3,4,6,3);
		Object arr[];
		arr = list1.stream().distinct().toArray();
	    System.out.println(Arrays.toString(arr));
		
	}

}
