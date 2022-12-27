package kumari.shweta.coding;
public class ConvertCamelCaseToSankeCase {
	
	public static String convertInSnake(String str) {
		
		String result="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(i>0 && Character.isUpperCase(ch)) {
			result=result+"_"+ch;
		}  else {
			result=result+ch;
		}
		
	}
	return result.toUpperCase();
	}
	
	public static void main(String[] args) {
		//whatIsYourName -->WHAT_IS_YOUR_NAME.
		
		String result=ConvertCamelCaseToSankeCase.convertInSnake("whatIsYourName");
		System.out.println("Result is "+result);
		
	}

}
