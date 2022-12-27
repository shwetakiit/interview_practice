package kumari.shweta.coding;


import java.util.HashMap;

import java.util.Scanner;

//String ShwetaKumari --S
//aaShbb-->S

public class FindingFirstNonRepeatingCharacter {
	
	
	public static Character firstNonRepeatingCharacter(String str) {

		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i =0; i<str.length();i++) {
			char c=str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
	
	for(int i =0 ;i<str.length();i++) {
		
	Character character=str.charAt(i);
	
	if(map.get(character)!=1) {
		continue;
	} else {
		return character;
	}
	
	}
	return null;
	}
	
	public static void main(String[] args) {
		
	
		
		System.out.println("Eneter String ");
		
		Scanner sc = new Scanner(System.in);
		String string=sc.nextLine();
		try {
	       char c=firstNonRepeatingCharacter(string);
	       System.out.println(c);
	
		}catch (Exception e) {
		System.out.println("-1");
		}
		
	}

}
