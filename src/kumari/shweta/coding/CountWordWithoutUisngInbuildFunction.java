package kumari.shweta.coding;

public class CountWordWithoutUisngInbuildFunction {
	public static void main(String[] args) {
		
		String string="Shweta Kumari Singh hello";
		char arr[]= string.toCharArray();
		
		int count=0;
		int wordlength=0;
		for(int i =0;i<arr.length;i++) {
			System.out.print("word is "+arr[i]+" ");
			if(arr[i]==' ' && arr[0]!=' ') {
				count++;
				wordlength=count+1;
				
			}
		}
		
		System.out.println("Total no of words is "+wordlength);
		//Second approach 
		String str[] = string.split(" ");
		System.out.println("count word"+str.length);
		
	}

}
