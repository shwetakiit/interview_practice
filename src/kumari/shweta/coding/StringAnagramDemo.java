package kumari.shweta.coding;

import java.util.Arrays;
//Check string is anagram or not and if not how many element should be remove from both string to make anagram

public class StringAnagramDemo {
	public static void main(String[] args) {
		
		String s1="ced";
		String s2="bac";
		//Out put should be 4 
		int noOfDeletion=0;
		char s1char[]=s1.toLowerCase().toCharArray();
		char s2char[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1char);
		Arrays.sort(s2char);
		
		s1=String.valueOf(s1char);
		s2=String.valueOf(s2char);
		if(s1.equals(s2)) {
			
			noOfDeletion=0;
			System.out.println(s1+ "and "+s2 +" are anagram");
			
		} else {
			
			for(int i=0 ;i<s1.length();i++) {
				
				char c=s1.charAt(i);
				int index=s2.indexOf(c);
				if(index!=-1) {
					s2=s2.substring(0, index)+s2.substring(index+1, s2.length());
				} else {
					noOfDeletion++;
				}
				
			}
		int length=	noOfDeletion+s2.length();
			System.out.println("No of character required to delete from both strigng is "+length);
		}

		
		
		
		
	}
	
}
