package kumari.sweta.Collection;
//https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#axzz7lL5xOFmU

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class MyComparator implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}

}

public class SortMapByValue {
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 11);
		map.put(2, 10);
		map.put(3, 11);
		map.put(5,13);
		map.put(4, 11);
		System.out.println(map);
	
		List<Map.Entry<Integer,Integer>> map1 = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		Map<Integer, Integer> sortedMap= new HashMap<Integer, Integer>();
		Collections.sort(map1,new MyComparator());
		for(Map.Entry<Integer, Integer> m1:map1) {

        System.out.println(m1.getKey()+"---"+m1.getValue());
			
		}
		
		System.out.println("After sorting map by value");
		System.out.println(sortedMap);
	

   Comparator<Map.Entry<Integer, Integer>> comparator=(o1,o2)->o1.getValue().compareTo(o2.getValue());
   Map<Integer,Integer> sortbyValueMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
   Map<Integer,Integer> sortbyValueMap1=map.entrySet().stream().sorted(comparator).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
   System.out.println("Sort map by value with Stream"+sortbyValueMap);
   
   System.out.println("Sorted by stream for value"+sortbyValueMap1);
	}

}
