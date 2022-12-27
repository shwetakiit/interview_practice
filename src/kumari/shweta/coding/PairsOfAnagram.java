package kumari.shweta.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PairsOfAnagram {
	private static void printAnagramPairs(String[] arr) {
		HashMap<String,ArrayList<String>> map = new HashMap<>();
		
		for(int i =0;i<arr.length;i++) {
			
			String word=arr[i];
			char sortedWord[]=word.toCharArray();
			Arrays.sort(sortedWord);
			
			String newWord=String.valueOf(sortedWord);
			System.out.println(newWord);
			if(!map.containsKey(newWord)) {
			ArrayList<String> wordList = new ArrayList<>();
			wordList.add(word);
			map.put(newWord, wordList);
			} else {
				
				map.get(newWord).add(word);
				
			}
				
		}
		System.out.println("map is "+map);
		for(String s:map.keySet()) {
			
			List<String> anagramPairs=map.get(s);
			if(anagramPairs.size()>1) {
				System.out.println(anagramPairs);
			}
			
	 }
}
	
	public static void main(String[] args) {
	String arr[]= {"cat", "dog", "tac", "god", "act"};
	
	printAnagramPairs(arr);
	}
}
