package kumari.shweta.coding;

import java.util.Scanner;



import kumari.shweta.interface1;

//Revrse Word  I love my self --> I evol ym self


public class ReverseWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Sentence");
		
		String string= sc.nextLine();
		
		String arrstr[] = string.split(" ");
		String reverseWord1 = "";
		for(int i=0;i<=arrstr.length-1;i++) {
			String word = arrstr[i];
			String reverseWord="";
			if(i!=0 && i!=(arrstr.length-1)) {
				
				for(int j= word.length()-1;j>=0;j--) {
					
					reverseWord = reverseWord+word.charAt(j);
				}
				//System.out.println(reverseWord);
				reverseWord1=reverseWord1+reverseWord+" ";
				
			} else {
				reverseWord1 = reverseWord1 +word+" ";
			}
			
		}
		
		System.out.println("Reversed word by normal string"+reverseWord1);
		String reverseWord="";
		
		for (String string2 : arrstr) {
			
			StringBuffer sBuffer = new StringBuffer(string2);
			sBuffer.reverse();
			reverseWord=reverseWord+sBuffer.toString()+" ";
			
			}
		
		reverseWord=reverseWord.trim();
		System.out.println("ReversedList Word by string buffer"+reverseWord);
		
	}

}
