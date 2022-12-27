package kumari.shweta;

public class CheckPolindrom {

	
	public boolean checkStringPolindrom(String str) {
		
		StringBuffer sbBuffer= new StringBuffer(str);
		String revString= sbBuffer.toString();
		if(str.equals(revString))
			return true;
		else 
			return false;
	}
	
	public boolean checkIntegerPolindrom(int num) {
		int orginal=num;
		int rev=0;
		while(num>0) {
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse no is "+rev);
		if(orginal==rev) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) { 
		
		CheckPolindrom polindrom = new CheckPolindrom();
	boolean isStringpol=	polindrom.checkStringPolindrom("ara");
	System.out.println("check string"+isStringpol);
	boolean isnumPol=	polindrom.checkIntegerPolindrom(121);
	System.out.println("Check number"+isnumPol);
		
	}


}
