package kumari.shweta.java8featureSample.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<Object> list= new ArrayList<Object>();
		//list.add(112);
		//list.add(113);
		//list.add(114);
		String str="";
		String str1="";
		
		for(int i =0;i<list.size();i++) {
			str=str+list.get(i)+",";
		}
		System.out.println(str);
		 str1=list.stream().map(Object::toString).collect(Collectors.joining(","));
		 System.out.println("value of str1 is "+str1);
		
	}

}
