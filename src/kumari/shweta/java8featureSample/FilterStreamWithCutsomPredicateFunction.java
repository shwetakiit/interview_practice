package kumari.shweta.java8featureSample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * 
 * Find String from list of string which start with pattern "aa" and print no of distict character from that String 
 */

class StringPredicate{
	
	public static Predicate<String> isMatchedString(){
		return s->s.startsWith("aa");
	}
	
}

class customFunction1{
	
	public static Integer apply(String str) {
		HashSet<Character> set= new HashSet();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		return set.size();
	}
	
}


public class FilterStreamWithCutsomPredicateFunction {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("aayush","aarya","khusboo");
		
		List<String> machedList=list.stream().filter(StringPredicate.isMatchedString()).collect(Collectors.toList());
		List<Integer> l1=list.stream().filter(StringPredicate.isMatchedString()).map(i->customFunction1.apply(i)).collect(Collectors.toList());
System.out.println("List is "+l1);
 for(int i=0;i<machedList.size();i++) {
	 System.out.println(machedList.get(i)+"has distinct character"+l1.get(i));
	 
 }
}
	
}
	
