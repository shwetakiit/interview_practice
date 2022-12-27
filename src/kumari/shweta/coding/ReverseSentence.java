package kumari.shweta.coding;

import java.util.Scanner;

import kumari.shweta.interface1;

//I.love.my.country

public class ReverseSentence {
	public static void main(String[] args) {
		System.out.println("Enter Sentence in . format");
		Scanner sc = new  Scanner(System.in);
		String string= sc.nextLine();
		String word[]=string.split("\\.");
		String reverString = " ";
		
		for(int i = word.length-1;i>=0;i--) {
			
			if(i>0) {
				reverString = reverString + word[i] +".";
			} else {
				reverString = reverString + word[i];
			}
		}
		System.out.println("Reverse word is ");
		System.out.println(reverString);
		
		
	}

}
