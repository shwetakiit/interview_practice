package kumari.shweta.java8featureSample;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class IterateMapfindValue {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Shweta");
	map.put(2, "Ragini");
	map.put(3, "hello");
	//Iterating hashMap using java 8
	map.forEach((i,j)->System.out.println("Keys is "+i+" Value is "+j));
	
	//Print map only for values which contains 'a'character
	Map<Integer,String> filteredMap=map.entrySet().stream().filter(m->m.getValue().contains("a")).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
	System.out.println(filteredMap);
	
	//Print using Map.Entry getKey and getValue using method reference
	Map<Integer, String> filterMap1 = map.entrySet().stream().filter(m->m.getValue().contains("a")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.println("filterMap1 is "+filterMap1);
	
	}

}
