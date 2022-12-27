package kumari.shweta.coding;

import java.util.Scanner;

import kumari.shweta.interface1;

public class RevereStringExceptSpecialCharacter {
	
	public static void reverse(char ch[]) {
		int l=0;
		int r=ch.length-1;
		while(l<r) {
			
			if(!Character.isAlphabetic(ch[l])) {
				l++;
			} else if(!Character.isAlphabetic(ch[r])) {
				r--;
			} else {
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter String ");
	Scanner scanner = new Scanner(System.in);

	String string= scanner.nextLine();
	char ch[] = string.toCharArray();
	reverse(ch);
	String string2 = new String(ch);
	System.out.println("Output of String is "+string2);
	}

}
