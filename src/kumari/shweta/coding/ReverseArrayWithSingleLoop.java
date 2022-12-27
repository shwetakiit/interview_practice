package kumari.shweta.coding;
public class ReverseArrayWithSingleLoop {
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,0,9,6,7,15};
		int l=0;
		int r=arr.length;
		for(int i =0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
