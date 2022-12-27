package kumari.shweta.java8featureSample;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIFilter {
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(12,20,35,46,55,68,75);
		int result=0;
		for(int i : list) {
			if(i%5==0) {
				result=result+i;
			}
		}
		//Sum of all element which is divisible by 5
		System.out.println(result);
		//We can use filter method
		//Convert List to stream
		System.out.println(list.stream().filter(i->i%5==0).reduce(0, (c,e)->c+e));
		
		//limit()
		int sumOfFirstTwoNo=list.stream().filter(i->i%5==0).limit(2).reduce(0, (c,e)->c+e);
		System.out.println("Sum of first two no which is div by 5"+sumOfFirstTwoNo);
		
		//Concat() -->Contact two streams 
		List<String> alphabet = Arrays.asList("A","B","C");
		List<String > names = Arrays.asList("Nickee","Bickee","Ragini");
		
	   Stream<String> opsStream = Stream.concat(alphabet.stream(), names.stream());
      //System.out.println("Concated Stream is "+opsStream);
		
	 //Display the element of Concated Stream
	 opsStream.forEach(str->System.out.println(str+" "));
		
		//Convert concated Stream In List
		List<String> resultList=opsStream.collect(Collectors.toList());
		System.out.println(resultList);
	}

}
