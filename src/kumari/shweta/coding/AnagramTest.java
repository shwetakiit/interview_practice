package kumari.shweta.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
public class AnagramTest {
	
	public static void anagram(String arr[]) {
		
		HashMap<String, ArrayList<String>> uniqueWord = new HashMap<String, ArrayList<String>>();
		for(int i =0;i<arr.length;i++) {
			String word1= arr[i];
		char ch[] = word1.toCharArray();
	    Arrays.sort(ch);
	    String keyString=String.valueOf(ch);
	    System.out.println(keyString);
	    if(uniqueWord.containsKey(keyString)) {
	    	
	    	uniqueWord.get(keyString).add(word1);
	    	
	    } else {
	    	
	    	ArrayList<String> anagram = new ArrayList<String>();
	    	anagram.add(word1);
	    	uniqueWord.put(keyString, anagram);
	    	
	    }
	   }
		System.out.println(uniqueWord);
		
		for(String s :uniqueWord.keySet() ) {
			List<String> list = uniqueWord.get(s);
			if(list.size()>1) {
				
				System.out.println(list);
			}
			
		}
		
	}
	public static void main(String[] args) {
		String arr[]= {"cat", "dog", "tac", "god", "act"};
		anagram(arr);
		
		
		
	
	}

}
