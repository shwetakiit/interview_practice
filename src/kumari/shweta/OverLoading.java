package kumari.shweta;

import java.util.Arrays;
import java.util.List;

public class OverLoading {
	

	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sum(int a, int b,int c) {
		return a+b+c;
	}
	
	public static void result( int arr[]) {
		 int sum=0;
		 int diff=0;
		 int k=0;
		Arrays.sort(arr);
		
	   for(int i =0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
		for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			} else {
				k++;
				if(k==1) {
				diff=arr[i];
				}
				else {
					diff=diff-arr[i];
				}
			}
		}
		System.out.println("sum is "+sum+" Diff is "+diff);
	}
	
	
	
	public static void main(String[] args) {
		
		OverLoading objLoading= new OverLoading();
		objLoading.sum(2, 3);
		int arr[] = {3,5,2,4,7,8,9};
		objLoading.result(arr);
		
	}

}
