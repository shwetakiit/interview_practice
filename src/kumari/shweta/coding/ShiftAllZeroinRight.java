package kumari.shweta.coding;
public class ShiftAllZeroinRight {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,0,9,4,7,0,3,0,0,3,6,0};
		int count=0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0)
			arr[count++]=arr[i];
		}
		for(int j =count;j<arr.length;j++) {
		 arr[j]=0;	
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]);
		}
		
	}

}
