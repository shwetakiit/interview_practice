package kumari.shweta.coding;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Mycomparator implements Comparator<Integer> {
	
	Map<Integer, Integer> freqMap;
	Mycomparator(Map freMap ){
		this.freqMap=freMap;
	}

	@Override
	public int compare(Integer key1,Integer key2) {
		
	 int freqComp=freqMap.get(key2).compareTo(freqMap.get(key1));
	 if(freqComp==0) {
	  return key1.compareTo(key2);
	 } else {
		 return freqComp;
	 }
		
	}
	
}

public class SortArrayBasedOnFrquency {
	
	public static void sortedBasedOnFrequency(int arr[]) {
	//Map<Integer, Long> map=	Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
  Map<Integer, Integer> map=	new HashMap<Integer, Integer>();
	List<Integer> outputArray=new ArrayList<Integer>();
		
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
		} else {
			map.put(arr[i], 1);
			outputArray.add(arr[i]);
			
		}
	}
	
	List<Integer> keys = new ArrayList<Integer>();
	
	System.out.println(map);
    Collections.sort(outputArray, new Mycomparator(map));
	System.out.println("***"+outputArray);
	
	}
	
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,1,6,4,5,3,1,4,0};
		sortedBasedOnFrequency(arr);
	}

}
