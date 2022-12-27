package kumari.shweta.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



//https://www.techiedelight.com/count-frequency-elements-list-java/

public class CountWordUsingHashMap {

	
	public static void main(String[] args) {
		String string="I shweta shweta singh kumari";
		String str[] = string.split(" ");
		List<String> list = Arrays.asList(str);
		System.out.println(list);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
for(String string2:str) {
	if(map.containsKey(string2)) {
	  map.put(string2, map.get(string2)+1);
	} else {
		map.put(string2, 1);
	}
}

map.forEach((key,value)->System.out.println(key+" Word count is "+value));	


//Count word using java 8 :stream API

List<String> list2= Arrays.asList(str);

Map<String,Long> map2=list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

System.out.println("Counted word "+map2);

	
	}
}
