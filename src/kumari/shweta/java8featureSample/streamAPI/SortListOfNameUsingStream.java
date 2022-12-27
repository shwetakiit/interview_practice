package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfNameUsingStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kajol");
		list.add("Anushka");
		list.add("Mallika");
	//Natural ,Ascending order sorting
	List<String> list1 = list.stream().sorted().collect(Collectors.toList());
	System.out.println(list1);	
	
	//Sort in desending order using comparator 
	
   List<String> list2 = list1.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
   System.out.println(list2);
   
   //Sort on the basis of length and if two string are equal in length then sort on the basis of alphabatical order
   Comparator<String> comparator= (s1,s2)->{
	   int l1 = s1.length();
	   int l2 = s2.length();
	   if(l1>l2) return +1;
	   else if (l1<l2) return -1;
	   else return s1.compareTo(s2);
	   
   };
   
   List<String> list3 = list.stream().sorted(comparator).collect(Collectors.toList());
   System.out.println(list3);
   
		
	}

}
