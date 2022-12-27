package kumari.shweta.java8featureSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {   //NORMAL APPROACH
         if(o1<o2) {
        	return -1;
         } else if (o1>o2) {
        	 return +1;
         } else {
        	 return 0;
         }
         
         //return (o1<o2)?-1:(o1>o2)?1:0; using ternary operator
	}
	
}

public class LamdaExpressionWithComparator {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	   list.add(5);
	   list.add(0);
	   list.add(10);
	   list.add(100);
Collections.sort(list,new MyComparator());
	   
	   Comparator<Integer> comparator=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
      Collections.sort(list,comparator);
      System.out.println(list);
}
}
