package kumari.shweta;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Shweta");
		list.add("Kumari");
		
		AbstractList<String> strings = new ArrayList<String>();
		strings.add("ab1");
		strings.add("ab2");
		System.out.println(strings);
		
		AbstractList<String> strings1 = new LinkedList();
		
		
	}

}
