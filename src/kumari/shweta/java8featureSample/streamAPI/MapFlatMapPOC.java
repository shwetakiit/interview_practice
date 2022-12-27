package kumari.shweta.java8featureSample.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapFlatMapPOC {

	public static void main(String[] args) {
		
		List<Integer> prime = Arrays.asList(1, 3, 5, 7);
		List<Integer> even = Arrays.asList(2, 4, 6, 8, 10);

		List<List<Integer>> mergeList = Arrays.asList(prime, even);
		System.out.println(mergeList);

		List<Integer> flattedList = mergeList.stream().flatMap(list -> list.stream().filter(i -> i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(flattedList);
		
		//We can't do flattening with map stream()
		//List<Integer> flattedListwithmap = mergeList.stream().map(list->list.stream().filter(i->i%2==0)).collect(Collectors.toList());
	//System.out.println(Collectors);
	List<Integer> normalMap = prime.stream().map(l -> l.intValue()+10).collect(Collectors.toList());
	System.out.println(normalMap);

	}

}
