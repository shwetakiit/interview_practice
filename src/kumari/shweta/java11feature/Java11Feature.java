package kumari.shweta.java11feature;
import java.util.stream.Stream;
public class Java11Feature {
	
	public static void main(String[] args) {
		
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());
		
		String str= "A\bc\td\nfi\rj\nJD\shweta\\kumari";
		Stream<String> line =str.lines();
		line.forEach(i->System.out.print(" "+i));
	//	line.forEach(System.out::println);
		System.out.println();
		//strip()---
		String string = "  shwetakumarisingh   ";
		System.out.println(string.length());
		System.out.println(string.strip().length());
		
		String string2 = "=".repeat(4);
		System.out.println(string2);
		
		//stripLeading()  --remove white space of lead of unichar 
		
		System.out.println("length before stripleading"+string.length());
		String str1=string.stripLeading();
		System.out.println("Length of leadingStip()"+str1.length() +"and string is");
		System.out.println(str1);
		
		//stripTrailing()
		
		String str2=string.stripTrailing();
		System.out.println("length of string after trailing"+str2.length());
		

	}

}
