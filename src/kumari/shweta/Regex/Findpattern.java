package kumari.shweta.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Findpattern {
	
	public static void main(String[] args) {
		String string="01011101011010";
		Pattern pattern = Pattern.compile("010");
		Matcher m = pattern.matcher(string);
		int count=0;
		while(m.find()) {
			count++;
		}
		System.out.println("pattern count is "+count);
		
	}

}
