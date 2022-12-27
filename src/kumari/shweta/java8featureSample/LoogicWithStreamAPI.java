package kumari.shweta.java8featureSample;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
class customFunction{
	
	public static Set<Character> hashset = new HashSet();
	
public static void myfilter(String str) {
	for(int i=0;i<str.length();i++) {
		hashset.add(str.charAt(i));
	}
	
}
}




public class LoogicWithStreamAPI {
	
	public static void main(String[] args) {
		
		List<String> names =  Arrays.asList("aarya","aananya","shweta","aayush");
		HashSet<Character> set= new HashSet<>();
	    
		List<String> aaprefixList =  names.stream().filter(i->i.startsWith("aa")).collect(Collectors.toList());
	//List<Integer> kIntegers=	aaprefixList.forEach(i->);
		
	
		
	}

}
