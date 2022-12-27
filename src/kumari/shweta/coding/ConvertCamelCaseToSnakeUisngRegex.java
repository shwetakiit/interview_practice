package kumari.shweta.coding;

public class ConvertCamelCaseToSnakeUisngRegex {
	public static void main(String[] args) {
		
		String regex="([a-z])([A-Z]+)";
		String replace="$1_$2";
		String string="whatIsYourName";
	    string=string.replaceAll(regex, replace).toUpperCase();
	    System.out.println("Converted string is "+string);
		
	}

}
