package kumari.shweta.coding;

import java.util.Stack;

public class ReoveAllDuplicateAdjacentCharacter {
	public static  String finalResult(String str) {
		int i=0;
		Stack<Character> stack=new Stack<Character>();
		
		while(i<str.length()) {
			if(stack.isEmpty()||(str.charAt(i)!=stack.peek())) {
				stack.push(str.charAt(i));
				i++;
			} else {
				stack.pop();
				i++;
			}
		}
		if(stack.isEmpty()) {
			return "Empty String";
		} else {
			String filterString="";
			while(!stack.isEmpty()) {
				filterString=stack.peek()+filterString;
				stack.pop();
			}
			return filterString;
		}
		
		
	}
	
public static void main(String[] args) {
	
	String string="azzxzya";
	  System.out.println(finalResult(string));
	
}

}
